class deamonThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("It is daemon thread");
        } else {
            System.out.println("not daemon thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread");

        deamonThread d = new deamonThread();
        d.setDaemon(true);
        d.start();

        Thread.sleep(100); // keep main thread alive
    }
}
