package Students2;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    static Student getStudent(List<Student> students, String firstName, String lastName){
        Student existingStudent = null;

        for(Student student:students) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }

        return existingStudent;
    }

    public static boolean IsStudentExisting(List<Student> students, String firstName, String lastName){
         for (Student student:students){
             if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                 return true;
             }
         }
         return false;
    }
}
