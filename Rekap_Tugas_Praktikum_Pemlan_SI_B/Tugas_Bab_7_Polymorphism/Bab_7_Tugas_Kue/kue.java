package polimorfisme.tugaskue;

public abstract class kue {
    private String nama;
    private double harga;

    public kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();

    public String toString() {
        return String.format("");
    }    
}
