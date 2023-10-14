import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] integerArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray(); // Array scanner

        boolean biggestNumber; // bool to keep check if current number
                               // is biggest

        for(int i = 0; i < integerArray.length; i++){ // gives starting point for comparison

            biggestNumber = true;
            for(int j = i + 1; j < integerArray.length; j++){ // gives number to be compared with starting number

                if (integerArray[i] <= integerArray[j]) { // checks if starting number is bigger
                    biggestNumber = false;
                    break;
                }
            }
            if(biggestNumber){
                System.out.print(integerArray[i] + " "); // Prints number if it is biggest
            }
        }
    }
}
