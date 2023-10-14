import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        int[] arrayOfNumbers = new int[numberOfInputs];

        for (int i = 0; i <= arrayOfNumbers.length-1; i++){
            arrayOfNumbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int j = arrayOfNumbers.length-1; j >= 0; j--){
            System.out.printf("%d ", arrayOfNumbers[j]);
        }
    }
}
