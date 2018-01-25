package tranning.Task8;

public class Viktim extends Mac {

    private String name = "Bob";
    private int age = 30;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private Viktim(int age) {
        this.age = age;
    }

    private Viktim(String name) {
        this.name = name;
    }

    public Viktim() { 
    }

    private Viktim(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void some(){
    }

    private void  someone(){
    }

    private void getMyName(){
    }

    private int integer(){
        return 0;
    }
}
