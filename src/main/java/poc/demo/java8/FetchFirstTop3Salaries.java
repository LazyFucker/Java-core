package poc.demo.java8;

import poc.demo.model.Employee;
import poc.demo.utill.CommonUtill;

import java.util.List;

public class FetchFirstTop3Salaries {
    public static void main(String[] args) {
        List<Employee> employeeList= CommonUtill.createEmployeeObj();

        employeeList.stream().sorted((e1,e2)->{
            double v = e2.getSalary() - e1.getSalary();
            return (int) v;
        }).limit(3).forEach(System.out::println);


    }
}
