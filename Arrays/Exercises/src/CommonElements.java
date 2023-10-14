import java.util.Objects;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstSentence = scanner.nextLine();
        String[] splitFirstSentence = firstSentence.split(" ");

        String secondSentence = scanner.nextLine();
        String[] splitSecondSentence = secondSentence.split(" ");

        for(int i = 0; i < splitSecondSentence.length; i++){
            for(int j = 0; j < splitFirstSentence.length; j++){
                if (Objects.equals(splitSecondSentence[i], splitFirstSentence[j])){
                    System.out.printf("%s ", splitSecondSentence[i]);
                }
            }

        }
    }
}
