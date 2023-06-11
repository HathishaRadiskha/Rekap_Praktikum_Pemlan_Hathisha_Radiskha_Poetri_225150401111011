public class Perpustakaan implements Peminjaman {
  @Override
  public void pinjamBuku(Buku buku, Anggota anggota) {
    // Logika untuk melakukan peminjaman buku
    if (!buku.isDipinjam()) {
      System.out.println("Buku [" + buku.getJudul() + "] berhasil dipinjam oleh [" + anggota.getNama() + "]!");
      buku.setDipinjam(true);
      anggota.setRiwayatPeminjaman(buku);
    } else {
      System.out.println("Buku [" + buku.getJudul() + "] sedang dipinjam oleh anggota lain!");
    }
  }

  @Override
  public void kembalikanBuku(Buku buku, Anggota anggota) {
    // Logika untuk melakukan pengembalian buku
    if (buku.isDipinjam()) {
      if (anggota.cekRiwayat(buku.getJudul())) {
        System.out.println("Buku berhasil dikembalikan oleh [" + anggota.getNama() + "]!");
        buku.setDipinjam(false);
      } else {
        System.out.println("Buku tidak sedang dipinjam oleh anggota tersebut!");
      }
    } else {
      System.out.println("Buku sedang tidak dipinjam!");
    }
  }
}
