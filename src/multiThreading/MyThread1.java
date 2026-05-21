public class MyThread1 implements Runnable {
    public void run () {
        System.out.println ("MultiThreading");
    }
    public static void main (String args[]) {
        MyThread1 myThread1=new MyThread1();
        Thread thread1= new Thread(myThread1);
        thread1.start();
    }
}