package poc.demo.java8;

import poc.demo.model.Employee;
import poc.demo.utill.CommonUtill;

import java.util.Comparator;
import java.util.List;

/**
 * Sort the employees in decending order based on salaries
 */
public class Sort_Decending_One {
    public static void main(String[] args) {
        List<Employee> employeeList= CommonUtill.createEmployeeObj();

        employeeList.stream().sorted((e1,e2)->{
                    double v = e2.getSalary() - e1.getSalary();
                    return (int) v;
                }).forEach(System.out::println);

    }
}
