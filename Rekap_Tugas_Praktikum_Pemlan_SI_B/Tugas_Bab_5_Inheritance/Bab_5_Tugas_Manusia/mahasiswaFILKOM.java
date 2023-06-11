package TugasPraktikumPemlan.tugasinheritance;

public class mahasiswaFILKOM extends manusia {
    private String nim;
    private double ipk;

    public mahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String prodi = "";

        switch(nim.substring(6, 7)) {
            case "2":
            prodi = "Teknik Informatika";
            break;

            case "3":
            prodi = "Teknik Komputer";
            break;

            case "4":
            prodi = "Sistem Informasi";
            break;

            case "6":
            prodi = "Pendidikan Teknologi Informasi";
            break;

            case "7":
            prodi = "Teknologi Informasi";
            break;
        }

        String angkatan = "20" + nim.substring(0, 2);
        String status = (prodi + ", " + angkatan);
        return status;
    }

    public double getBeasiswa() {
        double beasiswa = 0;

        if (ipk >= 3.0 && ipk <= 3.4) {
            beasiswa = 50;
        } else if (ipk > 3.4 && ipk <= 4.0){
            beasiswa = 75;
        } else {
            beasiswa = 0;
        }
        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        pendapatan += getTunjangan() + getBeasiswa();
        return pendapatan;
    }

    public String toString() {
        super.toString();
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Status : " + getStatus());
        String temp = "\n";
        return temp;
    }
}