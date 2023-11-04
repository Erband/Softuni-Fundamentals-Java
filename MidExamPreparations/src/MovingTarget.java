import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> shootingRange =
                Arrays.stream(scanner.nextLine().split(" "))
                .map(value -> Integer.parseInt(value))
                .collect(Collectors.toList());


        String[] command = new String[3];
        command[0] = " ";
        while (!command[0].contains("End")){
            command = scanner.nextLine().split(" ");
            if (command[0].contains("End")) break;
            String issuedCommand = command[0];


            int index = Integer.parseInt(command[1]);
            int valueOfCommand = Integer.parseInt(command[2]);

            switch (issuedCommand){
                case "Shoot":
                    shootTarget(shootingRange, index, valueOfCommand);
                    break;

                case "Add":
                    addTarget(shootingRange, index, valueOfCommand);
                    break;

                case "Strike":
                    strikeTargets(shootingRange, index, valueOfCommand);
                    break;
            }
        }

        for (int i = 0; i < shootingRange.size(); i++){
            if (i == shootingRange.size()-1){
                System.out.print(shootingRange.get(i));
            }
            else{
                System.out.print(shootingRange.get(i) + "|");
            }
        }
    }
    private static void shootTarget(List<Integer> shootingRange, int index, int power) {
        if (index < shootingRange.size() && index >= 0){
            if (shootingRange.get(index) - power <= 0 ) {
                shootingRange.remove(index);
            } else {
                shootingRange.set(index, shootingRange.get(index) - power);
            }
        }
    }

    private static void addTarget(List<Integer> shootingRange, int index, int value) {
        if (index >= shootingRange.size()) {
            System.out.println("Invalid placement!");
        }
        else {
            shootingRange.add(index, value);
        }
    }

    private static void strikeTargets(List<Integer> shootingRange, int index, int radius) {
        boolean hitsTarget = index + radius < shootingRange.size() && index - radius >= 0;

        if (!hitsTarget){
            System.out.println("Strike missed!");
        } else {
            for (int i = index + radius; i >= index - radius ; i-- ){
                shootingRange.remove(i);
            }
        }

    }
}
