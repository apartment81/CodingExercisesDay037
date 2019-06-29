package ro.mirodone;

public class Bonus extends Employee {

   private int baseSalary;
   private int bonusPercent;

     Bonus(String name, int baseSalary, int bonusPercent) {
        super(name);
        this.baseSalary=baseSalary;
        this.bonusPercent=bonusPercent;

    }

    @Override
    public int getSalary(int currentMonthHours) {
        return baseSalary + bonusPercent * baseSalary / 100;
    }



}
