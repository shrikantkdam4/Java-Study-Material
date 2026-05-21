public class ThreadWithThreadClass extends Thread {
    public void run () {
        System.out.println ("ThreadWithThreadClass");
    }
    public static void main (String args[]) {
        ThreadWithThreadClass threadWithThreadClass1=new ThreadWithThreadClass();
        threadWithThreadClass1.start();
    }
}