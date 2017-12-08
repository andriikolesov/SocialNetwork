package tranning.io;

/**
 * @author Igor Hnes on 08.12.17.
 */
public class Example {

    private int age = 20;

    public static void main(String[] args) {

    }

    private static void print(int number) {
        System.out.println("1");
    }

    private void print() {
        int age = 2; // local

        this.age = 3; // global

        System.out.println(age);

        System.out.println("2");
    }

    private static void print(String text) {
        System.out.println("2");
    }

    private static void print(String text, int value) {
        System.out.println("2");
    }
}
