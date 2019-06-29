package ro.mirodone;

abstract class Employee {

  private   String name;

     Employee (String name){
        this.name=name;
    }


     String getName() {
        return name;
    }


    abstract public int getSalary(int currentMonthHours);
}
