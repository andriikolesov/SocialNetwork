package tranning.Task8;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Viktim viktim = new Viktim();
        final Class<? extends Viktim> clazz = viktim.getClass();
        final Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);  // приглушает инкапсуляцию
        System.out.println("age before: " + viktim.getAge());
        age.set(viktim, 22);
        System.out.println("age after: " + viktim.getAge());

        final Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println("name before: " + viktim.getName());
        name.set(viktim, "Bobby");
        System.out.println("name after: " + viktim.getName());

        final Method integer = clazz.getDeclaredMethod("integer");
        integer.setAccessible(true);
        final Object invoke = integer.invoke(viktim);

        final String string;
        if(invoke instanceof String){
            string = (String) invoke;
        }else {
            string = "unknown";
        }
        System.out.println(string);
    }


}
