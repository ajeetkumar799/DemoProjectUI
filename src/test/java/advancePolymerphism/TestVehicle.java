package advancePolymerphism;
abstract class Vehicle {
    abstract void start();  // abstract method
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or button");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or self-start");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck starts with a heavy-duty ignition");
    }
}

public class TestVehicle {
    public static void main(String[] args) {

        // Array of parent type (Vehicle)
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Truck();

        // Loop through array → Runtime Polymorphism
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}