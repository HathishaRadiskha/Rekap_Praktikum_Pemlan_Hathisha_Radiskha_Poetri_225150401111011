import java.util.ArrayList;

public class Anggota {
  private String nama;
  private String nomorAnggota;
  private ArrayList<Buku> riwayatPeminjaman;

  // constructor, getter, setter, dan method lainnya
  public Anggota(String nama, String nomorAnggota) {
    this.nama = nama;
    this.nomorAnggota = nomorAnggota;
  }

  public void setRiwayatPeminjaman(Buku buku) {
    riwayatPeminjaman = new ArrayList<>();
    riwayatPeminjaman.add(buku);
  }

  public String getNama() {
    return nama;
  }

  public String getNomorAnggota() {
    return nomorAnggota;
  }

  public boolean cekRiwayat(String judul) {
    for (int i = 0; i < riwayatPeminjaman.size(); i++) {
      if (judul.equalsIgnoreCase(riwayatPeminjaman.get(i).getJudul())) {
        return true;
      }
    }
    return false;
  }
}