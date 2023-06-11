import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
  // Jalankan kode program disini
    ArrayList<Buku> daftarBuku = new ArrayList<>();
    daftarBuku.add(new Buku("Algoritma Pemrograman", "Aryo Pinandito", 2011));
    daftarBuku.add(new Buku("Sistem Jaringan Komputer", "Bayu Rahayudi", 2009));
    daftarBuku.add(new Buku("Pengembangan Tampilan Website", "Buce Trias", 2006));
    
    ArrayList<Anggota> daftarAnggota = new ArrayList<>();
    daftarAnggota.add(new Anggota("Hathisha", "0024"));
    daftarAnggota.add(new Anggota("Nabila", "0017"));
    daftarAnggota.add(new Anggota("Miftah", "0002"));
    
    Perpustakaan perpus = new Perpustakaan();
    perpus.pinjamBuku(daftarBuku.get(1), daftarAnggota.get(0));
    perpus.pinjamBuku(daftarBuku.get(2), daftarAnggota.get(1));
    perpus.pinjamBuku(daftarBuku.get(1), daftarAnggota.get(2));
    perpus.kembalikanBuku(daftarBuku.get(1), daftarAnggota.get(0));
    perpus.kembalikanBuku(daftarBuku.get(2), daftarAnggota.get(0));
    perpus.kembalikanBuku(daftarBuku.get(1), daftarAnggota.get(2));
  }
}
