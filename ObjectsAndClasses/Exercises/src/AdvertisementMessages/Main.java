package AdvertisementMessages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int messages = Integer.parseInt(scanner.nextLine());

        List<String> phrases = new ArrayList<>();
        phrases.add("Excellent product.");
        phrases.add("Such a great product.");
        phrases.add("I always use that product.");
        phrases.add("Best product of its category.");
        phrases.add("Exceptional product.");
        phrases.add("I can’t live without this product.");

        List<String> events = new ArrayList<>();
        events.add("Now I feel good.");
        events.add("I have succeeded with this product.");
        events.add("Makes miracles. I am happy of the results!");
        events.add("I cannot believe but now I feel awesome.");
        events.add("Try it yourself, I am very satisfied.");
        events.add("I feel great!");

        List<String> authors = new ArrayList<>();
        authors.add("Diana.");
        authors.add("Petya");
        authors.add("Stella");
        authors.add("Elena");
        authors.add("Katya");
        authors.add("Iva");
        authors.add("Annie");
        authors.add("Eva");

        List<String> cities = new ArrayList<>();
        cities.add("Burgas");
        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add("Varna");
        cities.add("Ruse");


        for (int i = 0; i < messages; i++){
            System.out.printf("%s %s %s - %s.\n", phrases.get(rand.nextInt(phrases.size() ) ),
                                                   events.get(rand.nextInt(events.size() ) ),
                                                   authors.get(rand.nextInt(authors.size() ) ),
                                                   cities.get(rand.nextInt(cities.size() ) ) );
                    ;
        }
    }
}
