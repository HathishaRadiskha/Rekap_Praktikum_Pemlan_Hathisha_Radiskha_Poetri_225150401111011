package modulpraktikum.tugasmodulbab2;

public class Rasional {
    private int pembilang;
    private int penyebut;
    private int n;
    private int m;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
        n = pembilang;
        m = penyebut;
    }

    public Rasional(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
        n = this.pembilang;
        m = this.penyebut;
    }

    public boolean isRasional() {
        return (penyebut != 0);
    }

    public void Sederhana(){ 
        int temp;
        int a;
        int b;

        if (penyebut ==0){ 
        return; 
        } 

        a = (pembilang < penyebut) ? penyebut : pembilang; 
        b = (pembilang < penyebut) ? pembilang : penyebut; 
        while (b != 0){ 
        temp = a % b; 
        a = b; 
        b = temp; 
        } 
         
        pembilang /= a; 
        penyebut /= a; 
        }
        
    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    public boolean moreThan(Rasional a) {
        return (pembilang * a.penyebut > penyebut * a.pembilang);
    }

    public void negasi() {
        pembilang =- pembilang;
    }

    public void unaryPlus(Rasional a) {
        n = pembilang;
        m = penyebut;
        pembilang = pembilang * a.penyebut + penyebut * a.pembilang;
        penyebut *= a.penyebut;
    }

    public void unaryMinus(Rasional a) {
        n = pembilang;
        m = penyebut;
        pembilang = pembilang * a.penyebut - penyebut * a.pembilang;
        penyebut *= a.penyebut;
    }

    public void unaryTimes(Rasional a) {
        n = pembilang;
        m = penyebut;
        pembilang = pembilang * a.pembilang;
        penyebut *= a.penyebut;
    }

    public void unaryDivide(Rasional a) {
        n = pembilang;
        m = penyebut;
        pembilang = (pembilang * a.penyebut);
        penyebut *= a.pembilang;
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
