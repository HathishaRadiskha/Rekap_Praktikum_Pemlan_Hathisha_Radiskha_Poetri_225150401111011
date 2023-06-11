package sib.Arraylist;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Hathisha Radiskha ");
        System.out.println("NIM     : 225150401111011");
        System.out.println();

        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Rayhan Priambodo", "Teknik Informatika", false));
        // Lakukan modifikasi data tambah mahasiswa

        // Method tampilSemuaData
        DataMahasiswa.tampilSemuaData();

        // Method cariMahasiswa (jika data ada)
        DataMahasiswa.cariMahasiswa("Grenda Jamaludin");
        System.out.println();

        // Method cariMahasiswa (jika data tidak ada)
        DataMahasiswa.cariMahasiswa("Hathisha Radiskha Poetri");
        System.out.println();

        // Method tampilMahasiswa (sebelum diupdate)
        DataMahasiswa.tampilMahasiswa(DataMahasiswa.cariMahasiswa("Rayhan Priambodo"));

        // Method tampilMahasiswa (setelah diupdate)
        DataMahasiswa.updateMahasiswa("Rayhan Priambodo", new Mahasiswa("Rayhan Sitepu", "Magister Ilmu Komputer", true));
        DataMahasiswa.tampilMahasiswa(DataMahasiswa.cariMahasiswa("Rayhan Sitepu"));
    }
}
