class Car {
    String brand;
    String model;
    double price;

    // Constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to start car
    public void startCar() {
        System.out.println(brand + " " + model + " is starting...");
    }

    // Method to stop car
    public void stopCar() {
        System.out.println(brand + " " + model + " is stopping...");
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 35000);

        car1.startCar();
        car1.stopCar();
    }
}