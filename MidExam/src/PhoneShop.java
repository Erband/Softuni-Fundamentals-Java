import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneInventory = new ArrayList<>(List.of(scanner.nextLine().split(", "))); // mutable string list

        // initializing command string
        String[] command = new String[3];
        command[0] = " ";

        while (!command[0].contains("End")){
            command = scanner.nextLine().split(" - ");

            if (command[0].contains("End")) break; // check to break from loop instantly

            String commandIssued = command[0]; // easier to access the issued command
            String phoneGiven = command[1]; // easier to access the issued command

            // checking all the different cases
            switch (commandIssued){
                case "Add":
                    if (phoneExists(phoneInventory, phoneGiven)){
                        break;
                    }
                    phoneInventory.add(phoneGiven);
                    break;
                case "Remove":
                    if (!phoneExists(phoneInventory, phoneGiven)){
                        break;
                    }
                    phoneInventory.remove(phoneGiven);
                    break;
                case "Bonus phone":
                    String[] phonesGiven = phoneGiven.split(":");
                    String oldPhone = phonesGiven[0];
                    String newPhone = phonesGiven[1];
                    if (!phoneExists(phoneInventory, oldPhone)) {
                        break;
                    }
                    phoneInventory.add(phoneInventory.indexOf(oldPhone)+1, newPhone );
                    break;
                case "Last":
                    if (!phoneExists(phoneInventory, phoneGiven)){
                        break;
                    }
                    String tempPhoneHolder = phoneGiven;
                    phoneInventory.remove(phoneGiven);
                    phoneInventory.add(tempPhoneHolder);
            }
        }

        printPhoneInventory(phoneInventory);
    }

    // function to make checking if a phone exists easier
    static boolean phoneExists(List<String> phoneInventory, String phoneModel){
        return phoneInventory.contains(phoneModel);
    }

    // print function
    static void printPhoneInventory(List<String> phoneInventory){
        for (int i = 0; i < phoneInventory.size(); i++){
            if (i == phoneInventory.size()-1){
                System.out.printf("%s", phoneInventory.get(i));
            } else {
                System.out.printf("%s, ",phoneInventory.get(i));
            }
        }
    }
}



