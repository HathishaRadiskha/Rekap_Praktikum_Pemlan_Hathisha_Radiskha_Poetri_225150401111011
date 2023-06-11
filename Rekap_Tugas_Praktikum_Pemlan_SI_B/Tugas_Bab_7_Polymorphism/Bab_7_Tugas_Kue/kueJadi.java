package polimorfisme.tugaskue;

public class kueJadi extends kue {
    private double jumlah;
    
    public kueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2;
    }
    
    public String toString() {
        super.toString();
        System.out.println("Harga       : " + getHarga());
        return String.format("Jumlah      : " + jumlah);
    }
}
