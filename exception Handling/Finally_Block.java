import java.io.FileInputStream;

public class Finally_Block {
    public static void main(String[] args) {
        // int a = 100, b = 0, c;
        // // int a = 100, b = 2, c;
        // try {
        // c = a / b;
        // System.out.println(c);
        // } catch (Exception e) {
        // System.out.println(e);
        // } finally {
        // System.out.println("always runs");

        // }

        FileInputStream fis = null;
        System.out.println("file open");

        try {
            fis = new FileInputStream("c:/abc.txt");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("file closed");
        }
    }
}
