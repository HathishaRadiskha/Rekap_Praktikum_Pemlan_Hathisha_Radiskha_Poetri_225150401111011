package polimorfisme.tugaskue;

import java.util.ArrayList;

public class mainprogram {
    public static void main(String[] args) {
        ArrayList<kue> cake = new ArrayList<>();
        
        cake.add(new kueJadi("Kue Soes", 5000, 3));
        cake.add(new kueJadi("Kue Creampuff", 5000, 2));
        cake.add(new kueJadi("Kue Pukis", 3000, 2));
        cake.add(new kueJadi("Kue Bolu Kukus", 30000, 1));
        cake.add(new kueJadi("Kue Cubit", 3500, 3));
        cake.add(new kueJadi("Kue Lapis", 1500, 3));
        cake.add(new kueJadi("Kue Pie Susu", 2500, 5));
        cake.add(new kueJadi("Kue Bolu Gulung", 35000, 1));
        cake.add(new kueJadi("Kue Tart Keju", 50000, 1));
        cake.add(new kueJadi("Kue Tart Coklat", 35000, 1));

        cake.add(new kuePesanan("Kue Putri Salju", 40000, 300));
        cake.add(new kuePesanan("Kue Nastar", 50000, 350));
        cake.add(new kuePesanan("Kue Dorayaki", 7500, 80));
        cake.add(new kuePesanan("Kue Kastengel", 35000, 250));
        cake.add(new kuePesanan("Kue Muffin", 20000, 100));
        cake.add(new kuePesanan("Kue Brownies Strawberry", 60000, 200));
        cake.add(new kuePesanan("Kue Lidah Kucing", 20000, 100));
        cake.add(new kuePesanan("Kue Nagasari", 15000, 250));
        cake.add(new kuePesanan("Kue Cucur", 15000, 120));
        cake.add(new kuePesanan("Kue Putu", 15000, 200));
        
        for (kue x : cake) {
            if (x instanceof kueJadi) {
                System.out.println("Kue Jadi    : " + x.getNama());
                System.out.println(x.toString());
                System.out.println();
            } else if (x instanceof kuePesanan) {
                System.out.println("Kue Pesanan : " + x.getNama());
                System.out.println(x.toString());
                System.out.println();
            }
        }

        double totalHargaJ = 0;
        double totalJumlah = 0;
        for (kue x : cake) {
            if (x instanceof kueJadi) {
                totalHargaJ += x.hitungHarga();
                totalJumlah += ((kueJadi) x).getJumlah();
            }
        }
        System.out.println("===================================================");
        System.out.println("Total Jumlah Kue Jadi   : " + totalJumlah + " pcs");
        System.out.println("Total Harga Kue Jadi    : Rp. " + totalHargaJ);
        System.out.println("===================================================");

        double totalHargaP = 0;
        double totalBerat = 0;
        for (kue x : cake) {
            if (x instanceof kuePesanan) {
                totalHargaP += x.hitungHarga();
                totalBerat += ((kuePesanan) x).getBerat();
            }
        }
        System.out.println("Total Berat Kue Pesanan : " + totalBerat + " gram");
        System.out.println("Total Harga Kue Pesanan : Rp. " + totalHargaP);
        System.out.println("===================================================");

        double totalHarga = 0;
        for (kue x : cake) {
            totalHarga += x.hitungHarga();
        }
        System.out.println("Total Harga Seluruh Kue: Rp. " + totalHarga);
        System.out.println("===================================================");
    }
}
