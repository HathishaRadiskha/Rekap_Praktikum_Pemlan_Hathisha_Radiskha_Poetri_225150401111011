package modulpraktikum.tugasmodul4.enkapsulasi2;

public class Vehicle1 {
    double load, maxload;

    public Vehicle1(double max) {
        this.maxload = max;
    }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxload;
    }

    public boolean addBox(double weight) {
        double temp = 0.0D;
        temp = this.load + weight;
        if (temp <= maxload) {
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}
