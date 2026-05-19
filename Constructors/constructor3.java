class Car {
    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    Car(Car c) {
        brand = c.brand;
        price = c.price;
    }

    void show() {
        System.out.println(brand + " " + price);
    }
}

public class constructor3 {
    public static void main(String[] args) {
        Car c = new Car("m", 25);
        c.show();
        Car c2 = new Car(c);
        c2.show();
    }
}
