public class ThreadWithRunnableInterface implements Runnable {
    public void run () {
        System.out.println ("ThreadWithRunnableInterface");
    }
    public static void main (String args[]) {
        ThreadWithRunnableInterface threadWithRunnableInterface1=new ThreadWithRunnableInterface();
        Thread thread1= new Thread(threadWithRunnableInterface1);
        thread1.start();
    }
}