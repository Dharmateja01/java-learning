package multithreading;

public class RunnableImplementsClass implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread is running");
        }
    }
    public static void main(String[] args) {
        RunnableImplementsClass ric = new RunnableImplementsClass();
        Thread t=new Thread(ric);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Main thread is running");
        }
    }
}
