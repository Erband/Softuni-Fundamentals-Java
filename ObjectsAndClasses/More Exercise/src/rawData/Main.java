package rawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static Car createCar(String[] carInput){
        String model = carInput[0];

        // engine specs
        int engineSpeed = Integer.parseInt(carInput[1]);
        int enginePower = Integer.parseInt(carInput[2]);
        Engine engine = new Engine(engineSpeed, enginePower);

        // cargo specs
        int cargoWeight = Integer.parseInt(carInput[3]);
        String cargoType = carInput[4];
        Cargo cargo = new Cargo(cargoWeight, cargoType);

        // the 4 tires
        Tire tire1 = new Tire(Double.parseDouble(carInput[5]));
        Tire tire2 = new Tire(Double.parseDouble(carInput[6]));
        Tire tire3 = new Tire(Double.parseDouble(carInput[7]));
        Tire tire4 = new Tire(Double.parseDouble(carInput[8]));

        Tire[] tireComplect = {tire1, tire2, tire3, tire4};

        return new Car(model, engine, cargo, tireComplect);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>(input);

        for (int i = 0; i < input; i++){
            String[] carInput = scanner.nextLine().split(" ");
            Car car = createCar(carInput);
            cars.add(car);
        }

        String soughtCargoType = scanner.nextLine();

        if (soughtCargoType.equals("fragile")){
            for (Car car : cars){
                if (car.cargo.getCargoType().equals(soughtCargoType) && car.lowPressure())
                {
                    System.out.println(car.getModel());
                }
            }
        }
        else {
            for (Car car : cars){
                if (car.cargo.getCargoType().equals(soughtCargoType) && car.highEnginePower() ){
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
