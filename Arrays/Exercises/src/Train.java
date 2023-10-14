import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = Integer.parseInt(scanner.nextLine());

        int[] train = new int[countOfWagons];
        int totalPassengers = 0;
        for (int i = 0; i < countOfWagons; i++){
            train[i] = Integer.parseInt(scanner.nextLine());
            totalPassengers += train[i];
        }

        for (int i = 0; i < countOfWagons; i++){
            System.out.printf("%d ", train[i]);
        }
        System.out.println();
        System.out.println(totalPassengers);


    }
}
