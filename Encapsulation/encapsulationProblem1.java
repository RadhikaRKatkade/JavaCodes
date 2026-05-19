import java.util.Scanner;

class student {
    private int marks;
    private String Grade;

    public void setGrade(int m) {
        marks = m;
    }

    public void getGrade() {
        if (marks > 80) {
            Grade = "A";
            System.out.println("Grade: " + Grade);
        } else if (marks > 65 && marks < 80) {
            Grade = "B";
            System.out.println("Grade: " + Grade);
        } else if (marks > 35 && marks < 65) {
            Grade = "C";
            System.out.println("Grade: " + Grade);
        } else {
            Grade = "F";
            System.out.println("Grade: " + Grade);
        }
    }
}

public class encapsulationProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks: ");
        int n = sc.nextInt();
        student s = new student();
        s.setGrade(n);
        s.getGrade();

    }
}
