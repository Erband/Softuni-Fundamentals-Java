package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        String input = " ";
        while (!input.contains("End") || !input.contains("Close the Catalogue")){
            input = scanner.nextLine();

            if (input.contains("End")){
                Vehicle.printVehicles(vehicles);
            } else if (input.contains("Close the Catalogue")) {
                Vehicle.closeCatalogue(cars, trucks);

            }
            String[] vehicleInput = input.split(" ");


            Vehicle vehicle = new Vehicle(vehicleInput[0],
                                     vehicleInput[1],
                                    vehicleInput[2],
                             Double.parseDouble(vehicleInput[3]) );

            if (vehicle.getTypeOfVehicle().equals("car")) {
                cars.add(vehicle);
                vehicles.add(vehicle);
            }
            else {
                trucks.add(vehicle);
                vehicles.add(vehicle);
            }

        }
    }
}
