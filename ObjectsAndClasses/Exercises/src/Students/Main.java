package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++){

            String[] newStudent = scanner.nextLine().split(" ");

            Student student = new Student( newStudent[0], newStudent[1], Float.parseFloat(newStudent[2]));

            studentList.add(student);
        }

        for (int i = 0; i < numberOfStudents; i++){
            for (int j = i; j < numberOfStudents; j++){
                if (studentList.get(j).grade > studentList.get(i).grade){
                    Student tempStudent = studentList.get(j);
                    studentList.set(j, studentList.get(i));
                    studentList.set(i, tempStudent);
                    i = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < numberOfStudents; i++){
            System.out.println(studentList.get(i));
        }
    }
}
