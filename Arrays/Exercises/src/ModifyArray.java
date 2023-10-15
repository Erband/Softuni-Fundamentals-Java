import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ModifyArray {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();

        String command = scanner.nextLine();


        while (!Objects.equals(command, "end")){

            if (command.contains("swap")){
                 int index1 = Integer.parseInt(command.split(" ")[1]);
                 int index2 = Integer.parseInt(command.split(" ")[2]);

                 int buffer = numbers[index1];
                 numbers[index1] = numbers[index2];
                 numbers[index2] = buffer;
            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                numbers[index1] = numbers[index1] * numbers[index2];
            } else if (command.contains("decrease")) {
                for(int i = 0; i < numbers.length; i++){
                    numbers[i]--;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++){
            if (i != numbers.length-1) System.out.print(numbers[i] + ", ");
            else System.out.print(numbers[i]);
        }
    }
}
