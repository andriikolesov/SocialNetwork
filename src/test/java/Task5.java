import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Task5 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Hello");
        map.put(2, "Hello");
        map.put(3, "Hello");
        map.put(4, "Hello");
        System.out.println(map);

        task1();
        task2();
    }

    public static void task1() {
        Map map = new HashMap();

        map.put(1,"hello");
        map.put(2,"hello");
        map.put(3,"hello");
        map.put(4,"hello");
        map.put(5,"hello");
        map.put(6,"hello");
        map.put(7,"hello");
        map.put(8,"hello");
        map.put(9,"hello");
        map.put(10,"hello");
        map.put("hello1", 1);
        map.put("hello2", 2);
        map.put("hello3", 3);
        map.put("hello4", 4);
        map.put("hello5", 5);
        map.put("hello6", 6);
        map.put("hello7", 7);
        map.put("hello8", 8);
        map.put("hello9", 9);
        map.put("hello10", 10);

        List<String> listStr = new LinkedList<>();
        List<Integer> listInt = new LinkedList<>();

        for (Object elem : map.keySet()) {
            if (elem instanceof String){
                listStr.add((String) elem);
            }else if (elem instanceof Integer){
                listInt.add((Integer) elem);
            }
        }
        System.out.println(listInt);
        System.out.println(listStr);
    }
}
