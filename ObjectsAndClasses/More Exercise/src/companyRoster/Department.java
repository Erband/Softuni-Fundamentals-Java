package companyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    List<Employee> employees;
    String department;

    public Department(String department){
        this.department = department;
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return this.department;
    }

    public double averageSalary(){
        double totalSalary =0;
        for (Employee employee : this.employees){
            totalSalary += employee.getSalary();
        }

        return totalSalary / employees.size();
    }
    public void sortBySalary(){
        for (int i = 0; i < this.employees.size(); i++){
            for (int j = i; j < this.employees.size(); j++){
                if (this.employees.get(j).getSalary() > this.employees.get(i).getSalary()){
                    Employee tempEmployee = this.employees.get(i);
                    this.employees.set(i, this.employees.get(j));
                    this.employees.set(j, tempEmployee);
                }
            }
        }
    }

    public void add(Employee employee){
        this.employees.add(employee);
    }
    public String toString(){
        return employees.toString();
    }



    // it is used to

}
