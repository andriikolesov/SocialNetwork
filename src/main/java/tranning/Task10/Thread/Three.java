package tranning.Task10.Thread;

public class Three {

    public static void main(String[] args) {

        final Thread thread1 = new Thread(new ThreadOne());
        thread1.start();
        final Thread thread2 = new Thread(new ThreadTwo());
        thread2.start();
        int[]mass = new int[100];
    }

    public static class ThreadOne implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
            }
        }
    }

    public static class ThreadTwo implements Runnable{
        @Override
        public void run() {
            for (int i = 100; i >= 50; i--) {
            }
        }
    }
}
