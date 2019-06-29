package ro.mirodone;

import java.util.List;

public class PayrollCalculator {

   private int currentMonthHours = 160;

     void computePayroll(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary(currentMonthHours));
        }
    }

}
