import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(value -> Double.parseDouble(value))
                        .collect(Collectors.toList());



        while (true){
            String command = scanner.nextLine();

            if(command.contains("end") ){
                break;
            }

            String[] tokens = command.split(" ");
            numbers = enactCommands(numbers, tokens);
        }
    }

    static List<Double> enactCommands(List<Double> numbers, String[] tokens) {
        switch (tokens[0]){
            case "Add":
                numbers = commandAdd(numbers, tokens[1]);
                break;
            case "Remove":
                numbers = commandRemove(numbers, tokens[1]);
                break;
            case "RemoveAt":
                numbers = commandRemoveAt(numbers, tokens[1]);
                break;
            case "Insert":
                numbers = commandInsert(numbers, tokens[1]);
                break;
        }

        return numbers;
    }

    private static List<Double> commandInsert(List<Double> numbers, String token) {
        return numbers;
    }

    private static List<Double> commandRemoveAt(List<Double> numbers, String token) {
        return numbers;
    }

    private static List<Double> commandRemove(List<Double> numbers, String token) {
        return numbers;
    }

    private static List<Double> commandAdd(List<Double> numbers, String token) {
        return numbers;
    }
}
