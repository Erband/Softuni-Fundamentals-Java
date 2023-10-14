import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstSeq = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        int[] secondSeq = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();


        int sum = 0;

        boolean identical = true;
        for (int i = 0; i < firstSeq.length; i++)
        {
            if (firstSeq[i] != secondSeq[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                identical = false;
                break;
            }
            else{
                sum += firstSeq[i];
            }
        }
        if (identical)
        {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
