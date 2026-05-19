class YoungerAgeException extends Exception {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new YoungerAgeException("you cannot vote");

            } else {
                System.out.println("can vote");
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
