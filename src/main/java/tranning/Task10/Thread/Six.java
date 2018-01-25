package tranning.Task10.Thread;

import java.io.*;

public class Six {

    public static void main(String[] args) {

        final Thread threadWrite = new Thread(new ThreadWrite());
        threadWrite.start();

        try (final BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        final Thread threadRead = new Thread(new ThreadRead());
        threadRead.start();

        try (final BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ThreadWrite implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if(i%2==0){
                    final String s = Thread.currentThread().getName() + " " + i;
                }
            }
        }
    }

    public static class ThreadRead implements Runnable{
        @Override
        public void run() {
        }
    }
}
