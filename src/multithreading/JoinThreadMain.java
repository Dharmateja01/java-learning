package multithreading;

public class JoinThreadMain {
    public static void main(String[] args) {
        Thread t = new Thread(new JoinThread());
        t.start();
        try {
            t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }
        System.out.println("Main finished");
    }
}
