package ro.mirodone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> emps = new ArrayList();
        emps.add(new Hourly("Vasile", 20));
        emps.add(new Monthly("Ionel", 1000));
        emps.add(new Bonus("Victor", 1200, 5));

        new PayrollCalculator().computePayroll(emps);
        
    }
}
