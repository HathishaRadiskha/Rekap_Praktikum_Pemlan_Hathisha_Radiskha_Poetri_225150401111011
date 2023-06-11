package sib.Arraylist;

import java.util.ArrayList;

class DataMahasiswa {
    private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
    private static Mahasiswa mahasiswa1 = new Mahasiswa();

    public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mahasiswa){
        mhs.add(mahasiswa);
        return mhs;
    }

    public static void tampilSemuaData(){
        for (int i = 0; i < mhs.size(); i++) {
            mahasiswa1 =  mhs.get(i);
            System.out.println("==== Tampilan Data Mahasiswa " + (i + 1) + " Filkom UB ====");
            System.out.println("Nama Mahasiswa  : " + mahasiswa1.getNama());
            System.out.println("Jurusan         : " + mahasiswa1.getJurusan());
            System.out.println("Status          : " + mahasiswa1.isStatus());
            System.out.println("");
        }
    }

    public static Mahasiswa cariMahasiswa(String nama) {
        // Gunakan perulangan
        for (int i = 0; i < mhs.size(); i++) {
            Mahasiswa y = mhs.get(i);
            String x = mhs.get(i).getNama();
            if (x.equalsIgnoreCase(nama)) {
                System.out.println("Data mahasiswa atas nama " + nama + " ditemukan:");

                return y;
            }
        }
        System.out.println("Data mahasiswa atas nama " + nama + " tidak ditemukan:");
        return null;
    }


    public static void tampilMahasiswa(Mahasiswa mahasiswa) {
        if (mahasiswa != null) {
            System.out.println("Nama Mahasiswa  : " + mahasiswa.getNama());
            System.out.println("Jurusan         : " + mahasiswa.getJurusan());
            System.out.println("Status          : " + mahasiswa.isStatus());
            System.out.println("");
        }
    }

    public static void updateMahasiswa(String nama, Mahasiswa mahasiswa) {
        for (int i = 0; i < mhs.size(); i++) {
            String x = mhs.get(i).getNama();
            if (x.equalsIgnoreCase(nama)) {
                mhs.set(i, mahasiswa);
            }
        }
    }
}
