package tranning.Task8;

import com.sun.xml.internal.ws.spi.db.FieldSetter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

public class Hacker {

    public static void main(String[] args) {

        List<String> reportList = new LinkedList<>();
        List<String> advanceReportList = new LinkedList<>();

        final Viktim viktim = new Viktim();

        final Class<?> clazz = viktim.getClass();
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            reportList.add("field: "+ field.getName());
        }

        reportList.add("\n");

        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods){
            reportList.add("method: " + method.getName());
        }

        reportList.add("\n");

        final Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors){
            reportList.add("constructor: " + constructor.getName());
        }

        reportList.add("\n");

        for (String elem : reportList) {
            System.out.println(elem);
        }

        final Field[] fields = clazz.getFields();
        for (Field field : fields) {
            field.getName();
            advanceReportList.add("field: " + field.getName());
        }

        advanceReportList.add("\n");

        final Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            method.getName();
            advanceReportList.add("method: " + method.getName());
        }

        advanceReportList.add("\n");

        final Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.getName();
            advanceReportList.add("constructor: " + constructor.getName());
        }

        advanceReportList.add("\n");

        for(String elem1 : advanceReportList){
            System.out.println(elem1);
        }
    }
}
