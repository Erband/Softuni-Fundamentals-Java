import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberSequence =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(value -> Integer.parseInt(value))
                        .collect(Collectors.toList());


        String[] command = new String[3];
        command[0] = " ";
        while (!command[0].contains("Finish")){
            command = scanner.nextLine().split(" "); // input of command
            String commandIssued = command[0]; // easier to grab the issued command

            // Program breaks if single word command is entered
            if (commandIssued.equals("Finish")) break;

            int value = Integer.parseInt(command[1]); // easier to grab needed value in command

            // switch to execute the different cases
            switch (commandIssued){
                case "Add":
                    numberSequence.add(value);
                    break;
                case "Remove":
                    for (int i = 0; i < numberSequence.size(); i++){
                        if (numberSequence.get(i) == value){
                            numberSequence.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int replacementOfValue = Integer.parseInt(command[2]);
                    for (int i = 0; i < numberSequence.size(); i++){
                        if (numberSequence.get(i) == value){
                            numberSequence.set(i, replacementOfValue);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    for (int i = 0; i < numberSequence.size(); i++){
                        if (numberSequence.get(i) < value){
                            numberSequence.remove(i);
                            i = -1;
                        }
                    }
            }
        }

        printSequence(numberSequence);

    }

    static void printSequence(List<Integer> numberSequence){
        for (Integer number : numberSequence) {
            System.out.printf("%d ", number);
        }
    }
}
