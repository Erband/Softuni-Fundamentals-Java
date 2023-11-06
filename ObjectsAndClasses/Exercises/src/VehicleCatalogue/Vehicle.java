package VehicleCatalogue;

import java.util.List;

public class Vehicle {
    String typeOfVehicle;
    String model;
    String color;
    double horsepower;

    public Vehicle(String typeOfVehicle, String model, String color, double horsepower){
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

    public String getModel(){
        return this.model;
    }

    public String getColor(){
        return this.color;
    }

    public double getHorsepower(){
        return this.horsepower;
    }

    public static double averageHorsepower(List<Vehicle> vehicles){
        double total = 0;
        for (Vehicle vehicle:vehicles){
            total += vehicle.horsepower;
        }
        return total / vehicles.size();
    }

    public static void closeCatalogue(List<Vehicle> cars, List<Vehicle> trucks){
        System.out.printf("Cars have average horsepower of %.2f", averageHorsepower(cars) );
        System.out.printf("Trucks have average horsepower of %.2f", averageHorsepower(trucks) );
    }

    public String toString(){
        return ("Type: " + typeOfVehicle +
                "\nModel: " + model +
                "\nColor: " + color +
                "Horsepower: " + String.format("%.2f", horsepower));
    }
    public static void printVehicles(List<Vehicle> vehicles){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
