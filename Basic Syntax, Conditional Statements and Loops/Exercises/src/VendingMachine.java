import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        String input = "";
        while (!input.equals("Start")){
            input = scanner.nextLine();
            switch (input){
                case "0.1":
                    sum += 0.1;
                    break;
                case "0.2":
                    sum += 0.2;
                    break;
                case "0.5":
                    sum += 0.5;
                    break;
                case "1":
                    sum += 1;
                    break;
                case "2":
                    sum += 2;
                    break;
                case "Start":
                    break;
                default:
                    System.out.printf("Cannot accept %.02f%n", Double.parseDouble(input));
            }

        }


        while (!input.equals("End")){
            input = scanner.nextLine();
            switch (input){
                case "Nuts":
                    if (sum - 2 < 0){
                        System.out.printf("Sorry, not enough money%n");
                    }else {
                        System.out.printf("Purchased %s%n", input);
                        sum -= 2;
                    }
                    break;

                case "Water":
                    if (sum - 0.7 < 0){
                        System.out.printf("Sorry, not enough money%n");
                    }else {
                        System.out.printf("Purchased %s%n", input);
                        sum -= 0.7;
                    }
                    break;

                case "Crisps":
                    if (sum - 1.5 < 0){
                        System.out.printf("Sorry, not enough money%n");
                    }else {
                        System.out.printf("Purchased %s%n", input);
                        sum -= 1.5;
                    }
                    break;

                case "Soda":
                    if (sum - 0.8 < 0){
                        System.out.printf("Sorry, not enough money%n");
                    }else {
                        System.out.printf("Purchased %s%n", input);
                        sum -= 0.8;
                    }
                    break;

                case "Coke":
                    if (sum - 1 < 0){
                        System.out.printf("Sorry, not enough money%n");
                    }else {
                        System.out.printf("Purchased %s%n", input);
                        sum -= 1;
                    }
                    break;

                case "End":
                    System.out.printf("Change: %.02f%n", sum);
                    break;

                default:
                    System.out.printf("Invalid product%n");
            }
        }

    }
}
