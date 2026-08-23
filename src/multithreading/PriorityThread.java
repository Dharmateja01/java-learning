package multithreading;
class PriorityThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority());
    }
}
