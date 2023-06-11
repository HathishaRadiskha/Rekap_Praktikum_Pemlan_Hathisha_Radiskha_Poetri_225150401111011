package modulpraktikum.tugasmodul5.tugasinheritance;

public class mainemployee {
    public static void main(String[] args) {
        manager boss = new manager("Steven", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        employee staff = new employee("Donni", 50000, 1989, 10, 1);
        System.out.println("Nama boss : " + boss.getName() + ", salary = " + boss.getSalary() + ", hired since: " + boss.getHireDay());
        System.out.println("Nama staff : " + staff.getName() + ", salary = " + staff.getSalary() + ", hired since: " + staff.getHireDay());
    }
}
