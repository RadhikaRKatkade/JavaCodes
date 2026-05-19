class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super();
    }
}

public class Throw_Keyword_Voting {
    public static void main(String[] args) {
        int age = 5;
        if (age < 18) {
            throw new YoungerAgeException("YOU CAN'T VOTE");
        } else {
            System.out.println("can vote");
        }

    }
}
