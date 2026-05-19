import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadAndWriteFile {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("c:/abc1.txt");
    }

    void writeFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("c:/abc1.txt");
    }
}

public class Throws_Keyword {
    public static void main(String[] args) {
        ReadAndWriteFile rw = new ReadAndWriteFile();
        System.out.println("for read");
        try {
            rw.readFile();
        } catch (FileNotFoundException e) {
            // System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("for write");
        try {
            rw.writeFile();
        } catch (FileNotFoundException e) {
            // System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("hello");

    }
}
