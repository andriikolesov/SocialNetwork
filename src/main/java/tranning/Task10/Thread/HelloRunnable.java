package tranning.Task10.Thread;

public class HelloRunnable implements Runnable {


    public void run(){
        System.out.println("Hello from a thread!");
    }

    private static class MyAwesome extends Thread {
        @Override
        public void run(){
            System.out.println("hello thread");

        }
    }
}
