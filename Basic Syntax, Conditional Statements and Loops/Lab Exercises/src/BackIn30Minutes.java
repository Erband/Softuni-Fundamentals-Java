import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        while (hours > 23 || hours < 0){
            hours = Integer.parseInt(scanner.nextLine());
        }

        int minutes = Integer.parseInt(scanner.nextLine());
        while (minutes > 59 || minutes < 0){
            minutes = Integer.parseInt(scanner.nextLine());
        }

        if (minutes + 30 >= 60){
            hours += 1;
            minutes -= 30;
        }
        else {
            minutes += 30;
        }

        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);

    }
}
