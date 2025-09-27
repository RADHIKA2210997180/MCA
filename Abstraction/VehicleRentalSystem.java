abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { 
        return vehicleNumber;
     }
    public String getType() {
         return type; 
        }
    public double getRentalRate() {
         return rentalRate; 
        }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate per day: " + rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;
    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days) {
         return getRentalRate() * days; 
        }
    public double calculateInsurance() {
         return 5000; 
        }
    public String getInsuranceDetails() {
         return "Car Insurance Policy: " + policyNumber; 
        }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;
    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days) { 
        return getRentalRate() * days;
     }
    public double calculateInsurance() {
         return 1000; 
        }
    public String getInsuranceDetails() {
         return "Bike Insurance Policy: " + policyNumber; 
        }
}

class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }
    public double calculateRentalCost(int days) {
         return getRentalRate() * days;
         }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        int days = 5;

        Car car = new Car("C101", 2000, "POL123");
        car.displayDetails();
        System.out.println("Rental Cost: " + car.calculateRentalCost(days));
        System.out.println("Insurance: " + car.calculateInsurance());
        System.out.println(car.getInsuranceDetails());
        System.out.println();

        Bike bike = new Bike("B101", 500, "POL456");
        bike.displayDetails();
        System.out.println("Rental Cost: " + bike.calculateRentalCost(days));
        System.out.println("Insurance: " + bike.calculateInsurance());
        System.out.println(bike.getInsuranceDetails());
        System.out.println();

        Truck truck = new Truck("T101", 3000);
        truck.displayDetails();
        System.out.println("Rental Cost: " + truck.calculateRentalCost(days));
    }
}
