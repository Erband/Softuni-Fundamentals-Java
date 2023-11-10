package companyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        List<Department> departments = new ArrayList<>();

        String[] employeeInput;

        for (int i = 0; i < input; i++){
            employeeInput = scanner.nextLine().split(" ");
            Employee employee = new Employee(employeeInput[0], Double.parseDouble(employeeInput[1]), employeeInput[2], employeeInput[3] );
            switch (employeeInput.length){
                case 4:
                    if (departments.isEmpty()) {
                        Department newDepartment = new Department(employee.getDepartment());
                        newDepartment.add(employee);
                        departments.add(newDepartment);
                    } else {
                        for (Department department : departments) {
                            if (!department.getDepartment().equals(employee.getDepartment())){
                                Department newDepartment = new Department(employee.getDepartment());
                                newDepartment.add(employee);
                                departments.add(newDepartment);
                            }
                            else {
                                department.add(employee);
                            }
                        }
                    }
                    break;
                case 5:
                    employee = new Employee(employeeInput[0], Double.parseDouble(employeeInput[1]), employeeInput[2], employeeInput[3], employeeInput[4] );

                    if (departments.isEmpty()) {
                        Department newDepartment = new Department(employee.getDepartment());
                        newDepartment.add(employee);
                        departments.add(newDepartment);
                    } else {
                        for (Department department : departments) {
                            if (!department.getDepartment().equals(employee.getDepartment())){
                                Department newDepartment = new Department(employee.getDepartment());
                                newDepartment.add(employee);
                                departments.add(newDepartment);
                            }
                            else {
                                department.add(employee);
                            }
                        }
                    }
                    break;
                case 6:
                    employee = new Employee(employeeInput[0], Double.parseDouble(employeeInput[1]), employeeInput[2],
                            employeeInput[3], employeeInput[4], Integer.parseInt(employeeInput[5]) );
                    if (departments.isEmpty()) {
                        Department newDepartment = new Department(employee.getDepartment());
                        newDepartment.add(employee);
                        departments.add(newDepartment);
                    } else {
                        for (Department department : departments) {
                            if (!department.getDepartment().equals(employee.getDepartment())){
                                Department newDepartment = new Department(employee.getDepartment());
                                newDepartment.add(employee);
                                departments.add(newDepartment);
                            }
                            else {
                                department.add(employee);
                            }
                        }
                    }
                    break;
            }


        }

        Department bestPerformingDepartment = null;

        for (Department department : departments) {
            if (department.averageSalary() > bestPerformingDepartment.averageSalary()) {
                bestPerformingDepartment = department;
            }
        }

        System.out.printf("\nHighest Average Salary: %s\n", bestPerformingDepartment.getDepartment());
        for (Employee employee : bestPerformingDepartment.getEmployees()){
            System.out.println(employee);
        }

    }
}
