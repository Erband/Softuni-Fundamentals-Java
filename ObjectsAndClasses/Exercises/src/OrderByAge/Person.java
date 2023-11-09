package OrderByAge;

import java.util.List;

public class Person {
    String name;
    String ID;
    int age;

    public Person(String name, String ID, int age){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getID(){
        return this.ID;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return name + " with ID: " + ID + " is " + age + " years old.";
     }


     public static void printPeople(List<Person> people){
        for (int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
     }
}
