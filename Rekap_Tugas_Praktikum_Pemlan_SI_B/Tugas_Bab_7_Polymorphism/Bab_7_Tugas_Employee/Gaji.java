package polimorfisme.tugasemployee;

public class Gaji extends Employee {
    private double produksi;

    public Gaji(String name, String noKTP, String hari, String bulan, String tahun, double produksi) {
        super(name, noKTP, hari, bulan, tahun);
        this.produksi = produksi;
    }

    public double getProduksi() {
        return produksi;
    }

    @Override
    public double earnings() {
        double upah = 100;
        return getProduksi() * upah * 4;
    }

    @Override
    public String toString() {
        System.out.println("Pegawai Borongan: " + getName());
        System.out.println("No. KTP: " + getNoKTP());
        System.out.println("Jumlah Produk Terjual: " + getProduksi());
        return "Pendapatan: " + earnings();
    }
}
