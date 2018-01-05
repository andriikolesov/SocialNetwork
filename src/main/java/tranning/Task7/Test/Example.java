package tranning.Task7.Test;

import java.lang.reflect.Method;

@RemindMe(reason = "just", when = "now")
public class Example {

    public static void main(String[] args) throws NoSuchMethodException {

        final Example example = new Example();
        final Class<? extends Example> clazz = example.getClass();

        Method methodTwo = clazz.getDeclaredMethod("two");

//        final boolean oneAnnotationPresent = methodOne.isAnnotationPresent(Reference.class);
        final boolean twoAnnotationPresent = methodTwo.isAnnotationPresent(Reference.class);
//        System.out.println("method one is " + oneAnnotationPresent);
        System.out.println("method two is " + twoAnnotationPresent);

        one();

    }

    @CodingTime
    private static void one() throws NoSuchMethodException {
        Example example = new Example();
        Class<? extends Example> clazz = example.getClass();
        Method methodOne = clazz.getDeclaredMethod("one");
        CodingTime annotation = methodOne.getAnnotation(CodingTime.class);
        System.out.println(annotation.task());

    }

    @Reference
    private static void two(){

    }
}
