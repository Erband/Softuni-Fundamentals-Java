import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double pricePerCapsule;
        int days;
        int capsulesCount;

        double price;
        double total = 0;
        for (int i = 0; i < orders; i++){
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());

            price = (days * capsulesCount) * pricePerCapsule;
            total += price;

            System.out.printf("The price for the coffee is: $%.2f\n", price);
        }

        System.out.printf("Total: $%.2f", total);
    }
}
