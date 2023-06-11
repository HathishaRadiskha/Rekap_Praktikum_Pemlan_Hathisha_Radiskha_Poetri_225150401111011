package modulpraktikum.tugasmodulbab2;

public class RasionalDemo {
    public static void main(String[] args) {
        Rasional r1 = new Rasional(5, 10);
        Rasional r2 = new Rasional(4, 8);

        System.out.println("r1.isRasional: " + r1.isRasional());
        System.out.println("r2.isRasional: " + r2.isRasional());
        System.out.println();

        System.out.println("r1 > r2: " + r1.moreThan(r2));
        System.out.println();

        System.out.print("r1: "); r1.cetak();
        System.out.print("r2: "); r2.cetak();
        System.out.println();

        r1.Sederhana();
        r2.Sederhana();

        System.out.print("r1: "); r1.cetak();
        System.out.print("r2: "); r2.cetak();
        System.out.println();

        System.out.println("Setelah dilakukan Cast ke double menjadi : ");
        System.out.println("r1 : " + r1.Cast());
        System.out.println("r2: " + r2.Cast());
        System.out.println();

        r1.negasi();
        System.out.print("Unary dari r1: "); r1.cetak();
        System.out.println();

        r1.unaryPlus(r2);
        System.out.print("Nilai dari 'r1 + r2': "); r1.cetak();
        System.out.println();
    }
}