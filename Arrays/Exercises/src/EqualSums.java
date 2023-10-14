import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int leftSum;
        int rightSum;

        if (numbers.length == 1){ // condition to check when there's a single number
            System.out.println(0);
            return;
        }

        boolean sidesAreEqual = false;
        int middleIndex = 0;

        for(int index = 0; index < numbers.length; index++){
            leftSum = 0; rightSum = 0; // resets the sums of both sides of the index

            for (int left = index - 1; left >= 0; left--){ // loop to add up left side of current index
                leftSum += numbers[left];
            }

            for(int right = index + 1; right < numbers.length; right++){ // loop to add up right side of current index
                rightSum +=numbers[right];
            }
            if (leftSum == rightSum){ // changes the index between both equal sides to the current one and stops the loop
                sidesAreEqual = true;
                middleIndex = index;
                break;
            }
        }

        if (sidesAreEqual){
            System.out.println(middleIndex);
        }
        else {
            System.out.println("no");
        }
    }
}
