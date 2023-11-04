import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args){
        // scanner to receive data;
        Scanner scanner = new Scanner(System.in);

        // different input data:
        double georgeBudget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceForFlour = Double.parseDouble(scanner.nextLine());
        double priceForEgg = Double.parseDouble(scanner.nextLine());
        double priceForApron = Double.parseDouble(scanner.nextLine());

        // Aprons get dirty, so George needs 20% extra, rounded up
        int neededAprons = (int) Math.ceil(students + students*0.2);

        // every fifth flour bought is free
        int neededFlour = students - students / 5;

        // total budget for all items after calculations
        double totalBudgetNeeded = neededFlour * priceForFlour
                                 + students * priceForEgg * 10
                                 + neededAprons * priceForApron;

        // final print results
        if (totalBudgetNeeded <= georgeBudget){ // case if george has enough money
            System.out.printf("Items purchased for %.2f$.", totalBudgetNeeded);
        } else { // case if george doesn't
            System.out.printf("%.2f$ more needed.", totalBudgetNeeded - georgeBudget);
        }
    }
}
