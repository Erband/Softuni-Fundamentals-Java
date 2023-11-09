package OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] input = new String[]{" "};

        List<Person> people = new ArrayList<>();

        while(!input[0].contains("End")){
            input = scanner.nextLine().split(" ");

            if(input[0].contains("End")) break;

            Person person = new Person(input[0], input[1], Integer.parseInt(input[2]));
            people.add(person);
        }

        for (int i = 0; i < people.size(); i++) {
            for (int j = i+1; j < people.size(); j++) {
                if (people.get(i).getAge() > people.get(j).getAge()) {
                    Person tempPerson = people.get(i);
                    people.set(i, people.get(j));
                    people.set(j, tempPerson);
                }

            }
        }

        Person.printPeople(people);
    }
}
