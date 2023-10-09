import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetsBroken = Math.floorDiv(lostGames, 2);
        int mousesBroken = Math.floorDiv(lostGames, 3);
        int keyboardsBroken = Math.floorDiv(lostGames, 6);
        int displaysBroken = Math.floorDiv(keyboardsBroken, 2);

        double expenses = headsetsBroken * headsetPrice +
                        mousesBroken * mousePrice +
                        keyboardsBroken * keyboardPrice +
                        displaysBroken * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}