package companyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        List<Department> departments = new ArrayList<>();

        String[] employeeInput = new String[]{" "};

        for (int i = 0; i < input; i++){
            employeeInput = scanner.nextLine().split(" ");
            String name = employeeInput[0];
            double salary = Double.parseDouble(employeeInput[1]);
            String position = employeeInput[2];
            String department = employeeInput[3];

            Employee employee = new Employee(name, salary, position, department );
            switch (employeeInput.length){
                case 5:
                    if (employeeInput[4].contains("@")) {
                        employee.setEmail(employeeInput[4]);
                    } else {
                        employee.setAge(Integer.parseInt(employeeInput[4]));
                    }
                    break;
                case 6:
                    employee.setEmail(employeeInput[4]);
                    employee.setAge(Integer.parseInt(employeeInput[5]) );
                    break;
            }
            if (departments.isEmpty()) {
                Department newDepartment = new Department(employee.getDepartment());
                newDepartment.add(employee);
                departments.add(newDepartment);
            } else {
                boolean depDoesExist = false;
                for (Department newDepartment : departments) {
                    if (employee.getDepartment().equals(newDepartment.getDepartment())){
                        newDepartment.add(employee);
                        depDoesExist = true;
                        break;
                    }
                }
                if (!depDoesExist) {
                    Department newDepartment = new Department(employee.getDepartment());
                    newDepartment.add(employee);
                    departments.add(newDepartment);
                }
            }


        }

        Department bestPerformingDepartment = departments.get(0);
        for (Department department : departments){
            if (department.averageSalary() > bestPerformingDepartment.averageSalary())
            {
                bestPerformingDepartment = department;
            }
        }

        bestPerformingDepartment.sortBySalary();
        System.out.printf("\nHighest Average Salary: %s\n", bestPerformingDepartment.getDepartment());
        for (Employee employee : bestPerformingDepartment.getEmployees()){
            System.out.println(employee);
        }

    }
};

