package TugasPraktikumPemlan.tugasinheritance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class pekerja extends manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        double bonus = 0;
        LocalDate tahunSekarang = LocalDate.now();
        long lamaTahun = tahunMasuk.until(tahunSekarang, ChronoUnit.YEARS);

        if (lamaTahun > 0 && lamaTahun <= 5) {
            bonus = (gaji * 0.05);
        } else if (lamaTahun > 5 && lamaTahun <= 10) {
            bonus = (gaji * 0.10);
        } else if (lamaTahun > 10) {
            bonus = (gaji * 0.15);
        }
        return bonus;
    }

    public double getGaji() {
        gaji += getBonus();
        return gaji;
    }

    @Override
    public double getTunjangan() {
        super.getTunjangan();
        tunjangan = (20 * jumlahAnak);
        return tunjangan;
    }

    public double getPendapatan() {
        pendapatan += getGaji() + getTunjangan();
        return pendapatan;
    }

    public String toString() {
        super.toString();
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Jumlah Anak : " + jumlahAnak);
        System.out.println("Gaji : " + getGaji());
        String temp = "\n";
        return temp;
    }
}
