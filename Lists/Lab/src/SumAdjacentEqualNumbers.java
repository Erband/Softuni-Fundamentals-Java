import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers
                = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.toArray().length - 1; i++) {
            double leftElement = numbers.get(i);
            double rightElement = numbers.get(i + 1);
            if (leftElement == rightElement) {
                numbers.set(i, leftElement + rightElement);
                numbers.remove(i + 1);
                i = -1;
            }
        }

        String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);
    }

    static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for(Double item : items){
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }
}
