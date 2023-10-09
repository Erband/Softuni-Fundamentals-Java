import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double cost = 0;

        switch (groupType){
            case "Students":
                switch (day){
                    case "Friday":
                        cost = 8.45 * group;
                        break;

                    case "Saturday":
                        cost = 9.8 * group;
                        break;

                    case "Sunday":
                        cost = 10.46 * group;
                        break;
                }
                break;

            case "Business":
                if (group >= 100) {
                    group -= 10;
                }
                switch (day){
                    case "Friday":
                        cost = 10.9 * group;
                        break;

                    case "Saturday":
                        cost = 15.6 * group;
                        break;

                    case "Sunday":
                        cost = 16 * group;
                        break;
                }
                break;

            case "Regular":

                switch (day){
                    case "Friday":
                        cost = 15 * group;
                        break;

                    case "Saturday":
                        cost = 20 * group;
                        break;

                    case "Sunday":
                        cost = 22.5 * group;
                        break;
                }
                break;
        }

        if (groupType.equals("Students") && group >= 30){
            cost *= 0.85;
            System.out.printf("Total price: %.2f", cost);
        } else if (groupType.equals("Regular") && group >= 10 && group <= 20) {
            cost *= 0.95;
            System.out.printf("Total price: %.2f", cost);
        } else {
            System.out.printf("Total price: %.2f", cost);
        }
    }
}
