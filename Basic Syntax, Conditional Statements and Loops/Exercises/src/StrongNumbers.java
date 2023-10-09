import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int tempNumber = number;

        int sum = 0;
        int factorial = 1;
        while (tempNumber != 0){
            factorial = 1;
            for (int i = 1; i <= tempNumber % 10; i++){
                factorial *= i;
            }
            sum += factorial;
            tempNumber /= 10;
        }

        if (sum == number) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}