package tugas;

public abstract class Vehicle {
  // buat variabel String nama, int tahun, dan double rpm
  protected String name;
  protected int year;
  protected double rpm;

  // buat sebuah method abstrak yang nantinya akan di override oleh class Car
  public abstract void getDescription();
}
