public class Buku {
  private String judul;
  private String penulis;
  private int tahunTerbit;
  private boolean dipinjam;

  // constructor, getter, setter, dan method lainnya
  public Buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
  }

  public void setDipinjam(boolean dipinjam) {
    this.dipinjam = dipinjam;
  }

  public String getJudul() {
    return judul;
  }

  public String getPenulis() {
    return penulis;
  }

  public int getTahunTerbit() {
    return tahunTerbit;
  }

  public boolean isDipinjam() {
    return dipinjam == true;
  }

  public String toString() {
    System.out.println("=============================================");
    System.out.println("Judul         : " + getJudul());
    System.out.println("Penulis       : " + getPenulis());
    System.out.println("Tahun Terbit  : " + getTahunTerbit());
    return String.format("=============================================");
  }
}
