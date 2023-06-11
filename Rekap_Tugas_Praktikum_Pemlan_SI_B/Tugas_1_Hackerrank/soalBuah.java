import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soalBuah {
    static buah b1 = new buah();
    static manusia m1 = new manusia();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        b1.nama = in.nextLine();
        b1.stok = in.nextInt();
        m1.jumlahBeli = in.nextInt();
        in.close();
        soalBuah sb1 = new soalBuah();
        sb1.output();
    }

    int sisaBuah(int x, int y) {
       return x - y; 
    }

    void output() {
        if (b1.stok > 0 && m1.jumlahBeli > 0) {
            if (b1.stok < m1.jumlahBeli) {
                System.out.println("Gagal checkout buah");            
            } else {
                System.out.println("Berhasil checkout buah");
                System.out.println("Sisa buah = " + sisaBuah(b1.stok, m1.jumlahBeli));
            }
        } else if (m1.jumlahBeli <= 0 || b1.stok <= 0) {
            System.out.println("NA");
        } 
    }
}

class buah {
    String nama;
    int stok;
}

class manusia {
    int jumlahBeli;
}