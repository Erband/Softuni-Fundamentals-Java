import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitCoins = 0;
        String[] rooms = scanner.nextLine().split("\\|");

        for (int i = 0; i < rooms.length; i++){
            String[] currentRoom = rooms[i].split(" ");
            String encounter = currentRoom[0];
            int roomValue = Integer.parseInt(currentRoom[1]);

            switch (encounter){
                case "potion":
                    if (health + roomValue > 100) {
                        System.out.printf("You healed for %d hp.\n", 100 - health);
                        health = 100;
                    } else {
                        System.out.printf("You healed for %d hp.\n", roomValue);
                        health += roomValue;
                    }
                    System.out.printf("Current health: %d hp.\n", health );
                    break;

                case "chest":
                    bitCoins += roomValue;
                    System.out.printf("You found %d bitcoins.\n", roomValue);
                    break;

                default:
                    health -= roomValue;
                    if (health > 0) {
                        System.out.printf("You slayed %s.\n", encounter);
                    } else {
                        System.out.printf("You died! Killed by %s.\n", encounter);
                        System.out.printf("Best room: %d\n", i+1);
                        return;
                    }
                    break;
            }

        };

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n", bitCoins);
        System.out.printf("Health: %d", health);
    }
}
