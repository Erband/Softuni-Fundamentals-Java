import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(e -> Double.parseDouble(e))
                        .collect(Collectors.toList());
        List<Double> result = new ArrayList<>();


        int middleElement;
        if (numbers.size() % 2 != 0){
            middleElement = numbers.size() / 2;
            numbers.add(middleElement, (double) 0);
        }


        for (int i = 0; i < numbers.size() / 2; i++){
            double leftElement = numbers.get(i);
            double rightElement = numbers.get( numbers.size() - 1 - i);
            result.add(leftElement + rightElement);
        }

        String output = joinElementsByDelimiter(result, " ");
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
