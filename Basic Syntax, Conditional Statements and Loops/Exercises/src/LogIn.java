import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        StringBuilder reversedUsername = new StringBuilder();

        reversedUsername.append(username);
        reversedUsername.reverse();

        String password = scanner.nextLine();

        boolean banned = false;
        int counter = 1;

        while(!banned && !password.contentEquals(reversedUsername)){
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
            counter++;
            if (counter == 4)
            {
                banned = true;
            }
        }

        if (banned){
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }

    }
}
