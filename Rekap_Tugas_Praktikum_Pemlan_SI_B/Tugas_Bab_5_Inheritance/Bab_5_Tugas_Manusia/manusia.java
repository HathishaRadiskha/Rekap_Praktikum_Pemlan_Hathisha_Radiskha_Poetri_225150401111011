package TugasPraktikumPemlan.tugasinheritance;

public class manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;
    public double tunjangan;
    public double pendapatan;

    public manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }
    
    public double getTunjangan() {
        if (menikah == true) {
            if (jenisKelamin == true) {
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        return pendapatan += getTunjangan(); 
    }

    @Override
    public String toString() {
        System.out.println("Nama : " + nama);
        System.out.println("NIK : " + nik);
        System.out.print("Jenis Kelamin : ");
        if (jenisKelamin == true) {
            System.out.println("Laki-laki");
        } else {
            System.out.println("Perempuan");
        }
        System.out.println("Pendapatan : " + getPendapatan() + "$");
        String temp = "\n";
        return temp;
    }
}
