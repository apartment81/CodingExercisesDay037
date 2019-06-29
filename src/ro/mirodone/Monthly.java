package ro.mirodone;

public class Monthly extends Employee{

    private int baseSalary;

     Monthly(String name, int baseSallary) {
        super(name);
        this.baseSalary = baseSallary;
    }

    @Override
    public int getSalary(int currentMonthHours) {
        return baseSalary;
    }

}
