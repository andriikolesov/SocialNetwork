package tranning.Task10.Thread;

import java.io.*;

public class Five {

    public static void main(String[] args) throws InterruptedException {

        final Thread threadWriter = new Thread(new ThreadWriter());
        final Thread threadReader = new Thread(new ThreadReader());
        threadReader.start();
        threadReader.join(1500);
        threadWriter.start();
    }

    public static class ThreadReader implements Runnable {
        @Override
        public void run() {
            String filePath = "src/main/resources/files/file.txt";
            File file = new File(filePath);
            try {
                FileReader fileReader = new FileReader(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                if (!(i % 2 == 0)) {
                    //
                }
            }
        }
    }

    public static class ThreadWriter implements Runnable{
        @Override
        public void run() {
            final String filePath = "src/main/resources/files/file.txt";
            File file = new File(filePath);
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    try {
                        fileWriter.write("number: " + i);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
