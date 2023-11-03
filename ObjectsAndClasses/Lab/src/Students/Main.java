package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String[] input = new String[]{""};

        while (!input[0].contains("end")){
            input = scanner.nextLine().split(" ");
            if (input[0].contains("end")) break;

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String hometown = input[3];

            Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHometown(hometown);

            students.add(student);
        }

        String soughtTown = scanner.nextLine();

        for(Student student:students){
            if(student.getHometown().equals(soughtTown)){
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
