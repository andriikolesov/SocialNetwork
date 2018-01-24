package tranning.Task10.Thread;

/**
 * @author Igor Hnes on 12.01.18.
 */
public class One {

    public static void main(String[] args) {

        Thread thread = new Thread (new Awesome(), "Awesome thread");
        thread.start();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
                    }
        thread.interrupt();
    }

    private static class Awesome implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);



                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("enought");
                    return;
                }
            }
        }
    }
}
