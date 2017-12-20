import java.util.*;

/**
 * @author Igor Hnes on 13.12.17.
 */
public class Task4 {

    public static void main(String[] args) {

        task1();
        task2();
    }

    private static void task1() {
        List<String> listStr = new LinkedList<>();
        List<Integer> listInt = new LinkedList<>();

        listStr.add("one");
        listStr.add("two");
        listStr.add("one");
        listInt.add(1);
        listInt.add(2);
        listInt.add(1);

        Set<String> setStr = new HashSet<>();
        Set<Integer> setInt = new HashSet<>();

        for (int i = 0; i < listStr.size() ; i++) {
            setStr.add(listStr.get(i));
        }
        System.out.println(setStr);

        for (int i = 0; i <listInt.size() ; i++) {
            setInt.add(listInt.get(i));
        }
        System.out.println(setInt);

    }

    public static void task2() {

        Set<Integer> setInt = new HashSet<>();
        Set<String> setStr = new HashSet<>();

        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(2);
        setInt.add(1);

        setStr.add("one");
        setStr.add("two");
        setStr.add("three");
        setStr.add("two");
        setStr.add("one");

        List<String> listStr = new LinkedList<>();
        List<Integer> listInt = new LinkedList<>();

        for (Integer elem : setInt) {
            listInt.add(elem);
        }
        System.out.println(listInt);

        for (String elem2 : setStr){
            listStr.add(elem2);
        }
        System.out.println(listStr);
        }
    }

