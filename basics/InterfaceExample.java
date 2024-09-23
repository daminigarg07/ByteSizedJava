interface Vehicle {
    void start();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.start();
    }
}
