package multithreading;

public class TestMultiThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestMultiThread t1 = new TestMultiThread();
        t1.start();
        for(int i=5;i<10;i++){
            System.out.println(i);
        }
    }

}
