import java.io.FileInputStream;

class problem1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("c:/abc.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Welcome to Google");
    }
}