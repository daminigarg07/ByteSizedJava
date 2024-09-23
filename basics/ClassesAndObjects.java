class Car {
    String brand;
    int year;

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.year = 2020;
        car.display();
    }
}
