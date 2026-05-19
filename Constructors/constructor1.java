class Box {
    int l, b, h;

    Box() {
        l = b = h = 10;
    }

    Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(int l) {
        this.l = b = h = l;
    }

    Box(Box b1) {
        l = b1.l;
        b = b1.b;
        h = b1.h;
    }

    void show() {
        System.out.println(l + " X " + b + " X " + h);
    }
}

class constructor1 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.show();

        Box b2 = new Box(2);
        b2.show();

        Box b3 = new Box(1, 2, 3);
        b3.show();

        Box b4 = new Box(b3);
        b4.show();
    }
}