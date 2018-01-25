import java.util.LinkedList;
import java.util.List;

public class Task3 {
        public static void main(String[] args) {

            List list = new LinkedList();
            list.add(1);
            list.add("one");
            list.add(2);
            list.add("two");
            list.add(3);
            list.add("three");
            list.add(4);
            list.add("four");
            list.add(5);
            list.add("five");
            list.add(6);
            list.add("six");
            list.add(7);
            list.add("seven");

            List<String> listStr = new LinkedList();
            List<Number> listInt = new LinkedList();
            for (Object o : list) {

                if (o instanceof String){
                    listStr.add((String) o);
                }else if (o instanceof Integer){
                    listInt.add((Number) o);
                }
            }
            System.out.println(listStr);
            System.out.println(listInt);


        }
    }


