package SumBigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();

        BigInteger a = new BigInteger(firstNumber);
        BigInteger b = new BigInteger(secondNumber);

        BigInteger sum = a.add(b);

        System.out.println(sum);

    }
}
