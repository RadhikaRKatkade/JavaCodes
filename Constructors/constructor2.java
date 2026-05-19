class Rectangle {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int area() {
        return l * b;
    }
}

public class constructor2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        System.out.println(r.area());
    }
}
