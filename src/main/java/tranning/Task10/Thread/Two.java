package tranning.Task10.Thread;

public class Two {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadOne());
        thread1.start();
        Thread thread2 = new Thread(new ThreadTwo());
        thread2.start();
        Thread thread3 = new Thread(new ThreadThree());
        thread3.start();
    }

    public static class ThreadOne implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("enough");
                    return;
                }
            }
        }
    }

    public static class ThreadTwo implements Runnable{

        @Override
        public void run() {
            for (int i = 10; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("enough");
                    return;
                }
            }

        }
    }

    public static class ThreadThree implements Runnable{

        @Override
        public void run() {
            for (int i = 20; i < 30; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("enough");
                    return;
                }
            }

        }
    }
}
