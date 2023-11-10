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

    public Employee(String name, double salary, String position, String department, String email){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }

    public Employee(String name, double salary, String position, String department, String email, int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getDepartment(){
        return this.department;
    }

    public String toString(){
        return name + " " + String.format("%.2f", salary) + " " + email + " " + age;
    }
}
