import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nLines = Integer.parseInt(scanner.nextLine());

        int[] firstLine = new int[nLines];
        int[] secondLine = new int[nLines];
        for (int i = 0; i < nLines; i++){

            if(i % 2 == 0){
                int[] inputLine = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
                firstLine[i] = inputLine[0];
                secondLine[i] = inputLine[1];
            } else {
                int[] inputLine = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
                secondLine[i] = inputLine[0];
                firstLine[i] = inputLine[1];
            }
        }

        for (int i = 0; i < nLines; i++){
            System.out.printf("%d ", firstLine[i]);
        }
        System.out.println();
        for (int i = 0; i < nLines; i++){
            System.out.printf("%d ", secondLine[i]);
        }
    }
}
