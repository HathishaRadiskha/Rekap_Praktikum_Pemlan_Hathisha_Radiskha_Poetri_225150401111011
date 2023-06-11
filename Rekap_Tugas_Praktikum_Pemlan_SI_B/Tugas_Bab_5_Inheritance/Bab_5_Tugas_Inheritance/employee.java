package modulpraktikum.tugasmodul5.tugasinheritance;

import java.util.Date;
import java.util.GregorianCalendar;

public class employee {
    private String name;
    private double salary;
    private Date hireday;
    
    public employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar= new GregorianCalendar(year, month-1, day);
        this.hireday = calendar.getTime();
    }

    public Date getHireDay() {
        return hireday;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary (double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}