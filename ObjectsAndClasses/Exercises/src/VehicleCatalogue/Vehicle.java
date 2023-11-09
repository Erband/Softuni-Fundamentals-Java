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

    public static void closeCatalogue(double carHorsepower, double totalCars, double truckHorsepower, double totalTrucks){
        double averageCarHorsepower;
        if (totalCars == 0){
            averageCarHorsepower = carHorsepower;
        }
        else {
            averageCarHorsepower = carHorsepower / totalCars;
        }

        double averageTruckHorsepower;
        if (totalTrucks == 0){
            averageTruckHorsepower = truckHorsepower;
        }
        else {
            averageTruckHorsepower = truckHorsepower / totalTrucks;
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", averageCarHorsepower );
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHorsepower );
    }

    public String toString(){
        return ("Type: " + typeOfVehicle.substring(0, 1).toUpperCase() + typeOfVehicle.substring(1).toLowerCase() +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nHorsepower: " + String.format("%.0f", horsepower));
    }

}
