
public class Task7 {

    public static void main(String[] args)  {

        main1();
        main2();
        main3();

    }

    private static void main1() {
        int [] mas = new int[3];
        try {
            System.out.println(mas[5]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void main3() {
        String text = "qwerty";
        try {
            Integer.valueOf(text);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void main2() {
        String name = "Alex";
        if (name.equals("Andrii")) {
            System.out.println(true);
        }name = null;
        try {
            if (name.equals("Andrii")) {
                System.out.println(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
