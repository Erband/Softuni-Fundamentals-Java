import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public  static  void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int tourists = Integer.parseInt(scanner.nextLine());
        int[] liftSpaces = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();
        boolean emptySpotsAvailable = false;
        boolean notEnoughSpotsAvailable = false;

        for(int i = 0; i < liftSpaces.length; i++){
            int freeSpaces;
            if (tourists > 0 && liftSpaces[i] < 4){
                freeSpaces = 4 - liftSpaces[i];
                if (freeSpaces > tourists){
                    liftSpaces[i] += tourists;
                    tourists = 0;
                }
                else {
                    liftSpaces[i] += freeSpaces;
                    tourists -= freeSpaces;
                }
            }

            if(liftSpaces[i] < 4){
                emptySpotsAvailable = true;
            }

        }

        if (tourists > 0) notEnoughSpotsAvailable = true;

        if (notEnoughSpotsAvailable){
            System.out.printf("There isn't enough space! %d people in a queue!\n", tourists);
            for (int i = 0; i < liftSpaces.length; i++) {
                System.out.print(liftSpaces[i] + " ");
            }
        } else if (emptySpotsAvailable) {
            System.out.print("The lift has empty spots!\n");
            for (int i = 0; i < liftSpaces.length; i++) {
                System.out.print(liftSpaces[i] + " ");
            }
        } else {
            for (int i = 0; i < liftSpaces.length; i++) {
                System.out.print(liftSpaces[i] + " ");
            }
        }
    }
}
