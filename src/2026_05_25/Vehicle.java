// Parent class
class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Child class
class Car extends Vehicle {

    // Overriding the drive() method
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
