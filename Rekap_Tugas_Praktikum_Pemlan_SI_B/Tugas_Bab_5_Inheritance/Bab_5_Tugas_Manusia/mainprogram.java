package TugasPraktikumPemlan.tugasinheritance;

public class mainprogram {
    public static void main(String[] args) {
        manusia a1 = new manusia("Wisnu", "1234", true, true);
        manusia a2 = new manusia("Luluk", "4321", false, true);
        manusia a3 = new manusia("Emeraldine", "1111", false, false);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        mahasiswaFILKOM b1 = new mahasiswaFILKOM("225150401111011", 2.7, "Hathisha Radiskha Poetri", "240104", false, false);
        mahasiswaFILKOM b2 = new mahasiswaFILKOM("225150401111011", 3.4, "Hathisha Radiskha Poetri", "240104", false, false);
        mahasiswaFILKOM b3 = new mahasiswaFILKOM("225150401111011", 4.0, "Hathisha Radiskha Poetri", "240104", false, false);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        pekerja c1 = new pekerja(1000, 2021, 1, 17, 2, "Alzam", "170704", true, true);
        pekerja c2 = new pekerja(1000, 2014, 1, 17, 0, "Alzam", "170704", true, true);
        pekerja c3 = new pekerja(1000, 2003, 1, 17, 10, "Alzam",  "170704", true, true);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        manager d1 = new manager("HRD", 7500, 2013, 1, 24, 0, "Reuben", "040717", true, true);
        System.out.println(d1);
    }   
}