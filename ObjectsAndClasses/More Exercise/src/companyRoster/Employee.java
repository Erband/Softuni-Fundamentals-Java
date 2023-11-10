package companyRoster;

public class Employee {
    String name;
    double salary;
    String position;
    String department;
    String email = "n/a";
    int age = -1;

    public Employee(String name, double salary, String position, String department){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return name + " " + String.format("%.2f", salary) + " " + email + " " + age;
    }
}
