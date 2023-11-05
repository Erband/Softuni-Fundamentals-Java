package Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> article = new ArrayList<>(List.of(scanner.nextLine().split(", ")));
        Article wholeArticle = new Article(article.get(0), article.get(1), article.get(2));

        int inputs = Integer.parseInt(scanner.nextLine());

        String[] command = new String[2];
        for(int i = 0; i < inputs; i++){
            command = scanner.nextLine().split(": ");
            switch (command[0]){
                case "Edit":
                    wholeArticle.Edit(command[1]);
                    break;

                case "ChangeAuthor":
                    wholeArticle.ChangeAuthor(command[1]);
                    break;
                case "Rename":
                    wholeArticle.Rename(command[1]);
                    break;
            }
        }
        System.out.println(wholeArticle);
    }
}
