package polimorfisme.tugasemployee;

public class CommissionEmployee extends Employee {
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi

    public CommissionEmployee(String name, String noKTP, String hari, String bulan, String tahun, double sales, double rate){
        super(name, noKTP, hari, bulan, tahun);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales){
        grossSales = sales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setCommissionRate(double rate){
        commissionRate = rate;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }

    public String toString(){
        return String.format("Commision employee: " + super.toString() + "\ngross sales: " + getGrossSales() + "\ncommission: " + getGrossSales() + "\ncommission rate: " + getCommissionRate());
    }
}
