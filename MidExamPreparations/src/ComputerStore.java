import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args){
        java.util.Scanner scanner = new Scanner(System.in);

        String input = "";
        double total = 0;
        boolean specialClient = false;

        while (!input.contains("special") || !input.contains("regular")){
            input = scanner.nextLine();

            if (input.contains("special")) {
                specialClient = true;
                break;
            } else if (input.contains("regular")) {
                break;
            }

            if (Double.parseDouble(input) < 0) {
                System.out.println("Invalid price!");
            } else {
                total += Double.parseDouble(input);
            }
        }
        if (total == 0) {
            System.out.println("Invalid order!");
            return;
        } else {
            printFinalResult(total, specialClient);
        }




    }

    private static void printFinalResult(double total, boolean specialClient) {
        double taxes = total * 0.2;
        double totalWithTaxes = taxes + total;
        if (specialClient) totalWithTaxes *= 0.9;

        System.out.printf("Congratulations you've just bought a new computer!\n" +
                            "Price without taxes: %.2f$\n" +
                            "Taxes: %.2f$\n" +
                            "-----------\n" +
                            "Total price: %.2f$", total, taxes, totalWithTaxes);
    }
}
