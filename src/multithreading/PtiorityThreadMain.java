package multithreading;

public class PtiorityThreadMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PriorityThread(), "High Priority");
        Thread t2 = new Thread(new PriorityThread(), "Low Priority");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
