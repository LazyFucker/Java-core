package org.example.medium;

import org.example.entity.Employee;

import java.util.List;

public class EmployeeService {
    private List<Employee> employeeList = Employee.getEmployeeList();

    public static void main(String[] args) {

        System.out.println("Hie");
    }

}
