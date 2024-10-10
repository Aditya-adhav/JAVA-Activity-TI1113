// Base class
class Vehicle {
    String brand;

    // Constructor for Vehicle
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Method in Vehicle
    void startEngine() {
        System.out.println(brand + " engine is starting.");
    }

    // Main method to test the inheritance
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 4, "Sedan");

        // Call methods from all levels
        myCar.startEngine();    // From Vehicle
        myCar.accelerate();     // From RoadVehicle
        myCar.shiftGear();      // From Car
        myCar.displayInfo();    // From Car
        System.out.println();

        // Create a Truck object
        Truck myTruck = new Truck("Ford", "F-150", 6, "Pickup");

        // Call methods from all levels
        myTruck.startEngine();    // From Vehicle
        myTruck.accelerate();     // From RoadVehicle
        myTruck.shiftGear();      // From Truck
        myTruck.displayInfo();    // From Truck
    }
}

// Derived class
class RoadVehicle extends Vehicle {
    int wheels;

    // Constructor for RoadVehicle
    RoadVehicle(String brand, int wheels) {
        super(brand); // Call the constructor of Vehicle
        this.wheels = wheels;
    }

    // Method in RoadVehicle
    void accelerate() {
        System.out.println(brand + " is accelerating.");
    }
}

// Sub-derived class
class Car extends RoadVehicle {
    String model;
    String type;

    // Constructor for Car
    Car(String brand, String model, int wheels, String type) {
        super(brand, wheels); // Call the constructor of RoadVehicle
        this.model = model;
        this.type = type;
    }

    // Method in Car
    void shiftGear() {
        System.out.println(brand + " " + model + " is shifting gear.");
    }

    // Method to display all information
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheels);
        System.out.println("Type: " + type);
    }
}

// Sub-derived class
class Truck extends RoadVehicle {
    String model;
    String type;

    // Constructor for Truck
    Truck(String brand, String model, int wheels, String type) {
        super(brand, wheels); // Call the constructor of RoadVehicle
        this.model = model;
        this.type = type;
    }

    // Method in Truck
    void shiftGear() {
        System.out.println(brand + " " + model + " is shifting gear with a loud rumble.");
    }

    // Method to display all information
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheels);
        System.out.println("Type: " + type);
    }
}
