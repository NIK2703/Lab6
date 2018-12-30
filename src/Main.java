public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("One");
        MyThread t2 = new MyThread("Two");
        t1.start();
        t2.start();
        //t1.setRunning();
       // t2.setRunning();
    }
}
