package modulpraktikum.tugasmodul4.tugasswalayan;

import java.util.Scanner;

public class mainswalayan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        swalayan data = new swalayan();
        
        boolean ulangan = true;
        do {
            System.out.println("Lakukan Pilihan:");
            System.out.println("1. Sign Up");
            System.out.println("2. Log in");
            System.out.print("Masukkan Pilihan Anda: "); int pilihan = in.nextInt();
            System.out.println("=========================================");
            switch (pilihan) {
                case 1:
                System.out.println("Masukkan Data Pengguna:");
                System.out.println("Nama: Hathisha Radiskha Poetri"); data.setNama("Hathisha Radiskha Poetri");
                System.out.println("Rank: Platinum"); data.setRank("Platinum");
                System.out.println("Masukkan 8 Digit Nomor Pengguna: 24011707"); data.setNomor("24011707");
                data.setNomorRank();
                data.setNomorID();
                System.out.println("Masukkan PIN Pengguna: 1111"); data.setPin("1111");
                System.out.println("=========================================");
                System.out.println("Akun Berhasil DIbuat!");
                data.informasiAkun();
                System.out.println("=========================================");
                break;
    
                case 2:
                System.out.println("Masukkan Data Pengguna:");
                System.out.println("Nama  : "); 
                String nama = in.nextLine();
                in.nextLine();
                System.out.println("Nomor : "); 
                String nomor = in.nextLine();
                System.out.println("PIN   : "); 
                String pin = in.nextLine();
                data.cekAutentifikasi(nama, data.getNama());
                data.cekAutentifikasi(nomor, data.getNomorID());
                data.cekAutentifikasi(pin, data.getPin());
                data.cekValidasi();
                System.out.println("=========================================");
                ulangan = false;
                break;
            }
        } while (ulangan == true);         
        data.informasiAkun();
        System.out.println("Lakukan Topup:");
        data.setTopUp(in.nextDouble());
        System.out.println("Lakukan Pembelian:");
        data.setPembelian(in.nextDouble());
        in.close();
    }
}
