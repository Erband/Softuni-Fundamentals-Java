package RandomizeWords;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        List<String> inputSentence = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();

        int inputSentenceLength = inputSentence.size();
        for(int i = 0; i < inputSentenceLength; i++){
            int randomIndex = random.nextInt(inputSentence.size());

            result.add(inputSentence.get(randomIndex));
            inputSentence.remove(randomIndex);
        }

        for(int i = 0; i < inputSentenceLength; i++){
            System.out.println(result.get(i));
        }
    }
}
