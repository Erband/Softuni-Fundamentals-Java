import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers =
                Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] temporaryArray = new int[arrayOfNumbers.length];


        for(int i = arrayOfNumbers.length-1; i > 0; i--){ // loop to condense the array every time
            for(int j = 0; j < i; j++){ // loop to add together current and next number and replace it in main array
                temporaryArray[j] = arrayOfNumbers[j] + arrayOfNumbers[j+1];
                arrayOfNumbers[j] = temporaryArray[j];
            }
        }

        System.out.println(arrayOfNumbers[0]);
    }
}
