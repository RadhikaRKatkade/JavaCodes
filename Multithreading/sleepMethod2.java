public class sleepMethod2 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) {
        sleepMethod2 s = new sleepMethod2();
        s.start();

    }

}
