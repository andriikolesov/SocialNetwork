import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            if (i % 2 == 0) {
                list.set(i, 10);
            }else
                list.set(i, 20);
        }
        System.out.println(list);
    }
}
