package ro.mirodone;

public class Hourly extends Employee {


    private int rate;

     Hourly(String name, int rate) {
        super(name);
        this.rate = rate;
    }

    @Override
    public int getSalary(int currentMonthHours) {
        return rate * currentMonthHours;
    }

}
