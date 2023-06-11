package polimorfisme.tugasemployee;

public abstract class Employee {
    private String name;
    private String noKTP;
    private String tanggal;

    public Employee(String name, String noKTP, String hari, String bulan, String tahun){
        this.name = name;
        this.noKTP = noKTP;
        this.tanggal = hari + "/" + bulan + "/" + tahun;
    }

    public String getName(){
        return name;
    }

    public String getNoKTP(){
        return noKTP;
    }

    public String getBulan(){
        return tanggal.substring(3, 5);
    }

    public String getTanggal() {
        return tanggal;
    }

    public String toString(){
        return String.format(" " + getName() + "\nNo. KTP: " + getNoKTP());
    }

    public abstract double earnings(); //pendapatan
}
