package tranning.Task7.Test;

import java.lang.reflect.Method;

@Deprecated
@RemindMe(reason = "just", when = "now")
public class Example2 {

    public static void main(String[] args) throws NoSuchMethodException {

        @Deprecated
        Example2 example2 = new Example2();
        Class<? extends Example2> ClassOne = example2.getClass();
        Class<? extends Example2> ClassTwo = example2.getClass();
        Method one = ClassOne.getDeclaredMethod("one");
        Method two = ClassTwo.getDeclaredMethod("two");
        if (two.isAnnotationPresent(AllowPrint.class)) {
            two();
        } else {
            throw new RuntimeException();
        }

    }

    @AllowPrint
    private static void one() {
        System.out.println("One");
    }

    private static void two() {
        System.out.println("Two");
    }

    @SuppressWarnings("unused")
    private static void three() {

    }

    private static void four() {
    }

    private static void five() {
    }
}

