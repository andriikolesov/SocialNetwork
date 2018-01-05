package tranning.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringJoiner;

public class Read {

    public static void main(String[] args) throws IOException {
        final String filePath = "src/main/resources/files/file.txt";
        File file = new File(filePath);

        final FileWriter writer = new FileWriter(file, true);

//        System.out.println("enter some text");
//        final String line = scanner.nextLine();
//
//        writer.write(line);
//        writer.flush();
//
//        final Scanner scanner = new Scanner(System.in);

//        final String text = "Hello )))";
//        writer.write(text);
//
//        String mas[] = {"one", "two", "three"};
//
//        for (String elem : mas) {
//            writer.write("Element: " + elem);
//            writer.write("\n");
//        }
//
//        writer.close();


        join();
    }

    private static void read() throws IOException {


        String text = "(((A";
        String replaced =
                text.replace("(", ")");

        final String fileFrom = "src/main/resources/files/from.txt";
        final String fileTo = "src/main/resources/files/to.txt";

        final BufferedReader reader =
                new BufferedReader(new FileReader(fileFrom));

        String data;
    }

    private static void getUserInfo() throws IOException {
        final String filePath = "src/main/resources/files/file.txt";
        File file = new File(filePath);

        final FileWriter writer = new FileWriter(file, true);

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur name");
        final String name = scanner.nextLine();

        writer.write("name: " + name);
        writer.write("\n");

        writer.flush();
        writer.close();

        scanner.close();
    }

    private static void join() {

        final StringJoiner joiner
                = new StringJoiner(" hahaha ");

        joiner.add("Hello");
        joiner.add("Hello");
        joiner.add("Hello");

        System.out.println(joiner.toString());
    }
}
