package multithreading;

public class JoinThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child: " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}
