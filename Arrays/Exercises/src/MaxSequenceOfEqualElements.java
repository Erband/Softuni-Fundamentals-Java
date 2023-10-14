import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int repeatedNumber = 0;
        int repeatingNumbersCounter = 0;
        int repeatedNumberBuffer = numbers[0];
        int repeatingNumbersCounterBuffer = 1;

        boolean neverChanged = true; // boolean to check if the array is made of only the same numbers

        for(int i = 0; i < numbers.length; i++){
            if (i == numbers.length-1){ // test case for when array is at the end, so that it doesn't try to reach out of bound index

                if (numbers[i] == numbers[i-1]){ // check if the current number and previous one are the same
                    repeatingNumbersCounterBuffer++;
                }
                else {
                    if (repeatingNumbersCounterBuffer > repeatingNumbersCounter){ // if they are not the same, a check if the current length counter is bigger than the previous one
                        repeatingNumbersCounter = repeatingNumbersCounterBuffer;
                        repeatedNumber = repeatedNumberBuffer;
                    }
                    neverChanged = false; // shows that the array has had different numbers
                }
            } else { // this is for the majority of the code, from 0 to n-2
                if (numbers[i] == numbers[i+1]){ // test if the current and next number are the same
                    repeatingNumbersCounterBuffer++;
                    repeatedNumberBuffer = numbers[i];
                }else {
                    if (repeatingNumbersCounterBuffer > repeatingNumbersCounter){ // if they are not the same, a check if the current length counter is bigger than the previous one
                        repeatingNumbersCounter = repeatingNumbersCounterBuffer;
                        repeatedNumber = repeatedNumberBuffer;
                    }
                    // resets all buffer counters and changes flag for unchanged array
                    repeatedNumberBuffer = 0;
                    repeatingNumbersCounterBuffer = 1;
                    neverChanged = false;
                }
            }

            if (neverChanged){ // in the case of the number never changing and never entering the different if cases
                repeatedNumber = repeatedNumberBuffer;
                repeatingNumbersCounter =repeatingNumbersCounterBuffer - 1; // since the counter starts from 1, the need to have 1 extra for the counting is redundant.
            }

        }

        // prints out the most repeated number and the number of times it was repeated
        for (int i = 0; i < repeatingNumbersCounter; i++){
            System.out.print(repeatedNumber + " ");
        }
    }
}
