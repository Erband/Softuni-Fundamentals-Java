import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergeLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> firstList =
            Arrays.stream(scanner.nextLine().split(" "))
                    .map(value -> Double.parseDouble(value))
                    .collect(Collectors.toList());

        List<Double> secondList =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(value -> Double.parseDouble(value))
                        .collect(Collectors.toList());

        int newListSize = firstList.size() + secondList.size();

        List<Double> combinedList = new ArrayList<>();

        int firstListCounter = 0;
        int secondListCounter = 0;

        for(int i = 0; i < newListSize; i++){
            if (i % 2 == 0 && firstListCounter < firstList.size()){
                double newElement = firstList.get(firstListCounter);
                combinedList.add(newElement);
                firstListCounter++;
            }
            else if(i % 2 != 0 && secondListCounter < secondList.size()){
                double newElement = secondList.get(secondListCounter);
                combinedList.add(newElement);
                secondListCounter++;
            } else if (firstListCounter >= firstList.size()) {
                double newElement = secondList.get(secondListCounter);
                combinedList.add(newElement);
                secondListCounter++;
            } else {
                double newElement = firstList.get(firstListCounter);
                combinedList.add(newElement);
                firstListCounter++;
            }
        }

        String output = joinElementsByDelimiter(combinedList, " ");
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
