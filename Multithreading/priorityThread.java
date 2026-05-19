public class priorityThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        priorityThread p = new priorityThread();
        p.start();

    }
}
