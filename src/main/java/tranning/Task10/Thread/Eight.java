package tranning.Task10.Thread;

public class Eight {

    public static void main(String[] args) throws InterruptedException {

         Eight eight = new Eight();
         Thread thread = new Thread(() -> eight.drinkBeer());
         thread.start();
    }

    private void drinkBeer() {
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "Igor" + i);
            }try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
