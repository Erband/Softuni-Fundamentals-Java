import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayInput = Integer.parseInt(scanner.nextLine());

        if (dayInput > 0 && dayInput <= daysOfWeek.length){
            System.out.println(daysOfWeek[dayInput-1]);
        }
        else {
            System.out.println("Invalid day!");
        }
    }
}
