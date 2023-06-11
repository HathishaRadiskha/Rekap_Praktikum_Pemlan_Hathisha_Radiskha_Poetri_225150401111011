package tugas;

public class Car extends Vehicle {
  // buat variabel owner yang bertipe data Owner
  private Owner owner;

  Car(Owner o, String name, int year, double rpm) {
    // todo...
    this.owner = o;
    this.name = name;
    this.year = year;
    this.rpm = rpm;
  }

  public void getDescription() {
    System.out.println("Car name\t: " + this.name);
    System.out.println("Car owner\t: " + this.owner.getName());
    System.out.println("Output year\t: " + this.year);
    System.out.println("RPM\t\t: " + this.rpm);
  }
}
