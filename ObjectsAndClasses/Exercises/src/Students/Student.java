package Students;

public class Student {
    String firstName;
    String lastName;
    float grade;

    public Student(String firstName, String lastName, float grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setGrade(float grade){
        this.grade = grade;
    }
    public float getGrade(){
        return this.grade;
    }

    public String toString(){
        return firstName + " " + lastName + ": " + String.format("%.2f", grade);
    }
}
