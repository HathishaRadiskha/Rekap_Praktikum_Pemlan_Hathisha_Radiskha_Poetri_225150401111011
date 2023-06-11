package sib.Arraylist;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private boolean status; // true=Menikah ; false=Lajang

    // Tambahkan constructor disini
    public Mahasiswa(String nama, String jurusan, boolean status) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.status = status;
    }

    public Mahasiswa() {

    }

    // Tambahkan method setter & getter disini
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String isStatus() {
        String statusmhs;
        if (this.status == true) {
            statusmhs = "Menikah";
        } else {
            statusmhs = "Lajang";
        }
        return statusmhs;
    }
}
