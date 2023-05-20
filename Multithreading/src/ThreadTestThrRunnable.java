public class ThreadTestThrRunnable implements Runnable{

    public void run() {
        System.out.println("Thread is started...");
        System.out.println(this.getClass().getName());

    }


    public static void main(String[] args) {

        Thread t = new Thread(new ThreadTestThrRunnable(),"monukd");
        System.out.println(t.getName());
        t.start();
    }


}