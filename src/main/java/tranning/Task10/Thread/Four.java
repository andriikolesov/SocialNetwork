package tranning.Task10.Thread;

public class Four {

    public static void main(String[] args) throws InterruptedException {
        final Thread thread1 = new Thread(new ThreadClass());
        final Thread thread2 = new Thread(new ThreadClassTwo());
        thread1.start();
        thread1.join(300);
        thread2.start();
    }

    public static class ThreadClass implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ThreadClassTwo implements Runnable {
        @Override
        public void run() {
            for (int i = 5; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
