import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] mainArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());



        for(int i = 0; i < rotations; i++){
            int[] rotatedArray = new int[mainArray.length];
            rotatedArray[mainArray.length-1] = mainArray[0];
            for(int j = 0; j < mainArray.length-1; j++){
                rotatedArray[j] = mainArray[j+1];
            }

            mainArray = rotatedArray;
        }

        for(int i = 0; i < mainArray.length; i++){
            System.out.printf("%d ", mainArray[i]);
        }
    }
}
