package VehicleCatalogue;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();


        String[] input = new String[]{" "};

        while (!input[0].contains("End")){
            input = scanner.nextLine().split(" ");
            if (input[0].contains("End")){
                break;
            }
            Vehicle vehicle = new Vehicle(input[0], input[1], input[2], Double.parseDouble(input[3]) );
            vehicles.add(vehicle);
        }

        double totalCarHorsepower = 0;
        double totalCars = 0;
        double totalTruckHorsepower = 0;
        double totalTrucks = 0;
        String anotherInput = " ";
        while (!anotherInput.equals("Close the Catalogue")){
            anotherInput = scanner.nextLine();
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getTypeOfVehicle().equals("car")) {
                    totalCarHorsepower += vehicle.getHorsepower();
                    totalCars++;
                }
                else if (vehicle.getTypeOfVehicle().equals("truck")) {
                    totalTruckHorsepower += vehicle.getHorsepower();
                    totalTrucks++;
                }
                if (anotherInput.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                }
            }
        }

        Vehicle.closeCatalogue(totalCarHorsepower, totalCars, totalTruckHorsepower, totalTrucks);

    }
}
