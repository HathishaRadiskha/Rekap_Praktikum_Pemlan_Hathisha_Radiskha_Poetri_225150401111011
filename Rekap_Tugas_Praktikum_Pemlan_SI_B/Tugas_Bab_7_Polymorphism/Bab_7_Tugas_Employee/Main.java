package polimorfisme.tugasemployee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", "24", "09", "1977", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", "16", "05", "2007", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", "27", "01", "2004", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", "24", "03", "2000", 5000, .04, 300);

        String tanggal = "24/01/2004";
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(salariedEmployee);
        employees.add(hourlyEmployee);
        employees.add(commissionEmployee);
        employees.add(basePlusCommissionEmployee);

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getBulan().equals(tanggal.substring(3, 5))) {
                System.out.println("Selamat Ulang Tahun " + employees.get(i).getName() + "!");
                System.out.println(employees.get(i).toString());
                System.out.println("Pendapatan: " + (employees.get(i).earnings() + 100000));
            }
        }
    }
}
