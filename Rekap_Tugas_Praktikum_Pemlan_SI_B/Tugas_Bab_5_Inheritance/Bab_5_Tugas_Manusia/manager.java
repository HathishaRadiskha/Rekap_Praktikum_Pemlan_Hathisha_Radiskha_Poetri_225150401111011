package TugasPraktikumPemlan.tugasinheritance;

public class manager extends pekerja{
    private String departemen;

    public manager(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, nik, 
        jenisKelamin, menikah);
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan() {
        super.getTunjangan();
        tunjangan += getGaji() * 0.10;
        return tunjangan;
    }

    public String toString() {
        super.toString();
        System.out.println("Departemen : " + departemen);
        String temp = "\n";
        return temp;
    }
}
