import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int counter = -1;
        for(int i = 0; i < n; i++){
            counter += 2;
            System.out.println(counter);
            sum += counter;
        }
        System.out.printf("Sum: %d", sum);
    }
}
