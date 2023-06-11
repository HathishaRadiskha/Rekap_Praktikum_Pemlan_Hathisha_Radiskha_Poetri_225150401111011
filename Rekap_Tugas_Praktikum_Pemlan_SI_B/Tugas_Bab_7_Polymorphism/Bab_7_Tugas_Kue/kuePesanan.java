package polimorfisme.tugaskue;

public class kuePesanan extends kue {
    private double berat;

    public kuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }
    
    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    public String toString() {
        super.toString();
        System.out.println("Harga       : " + getHarga());
        return String.format("Berat       : " + berat);
    }
}
