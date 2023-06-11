package tugas;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    // todo...
  
    ArrayList<Car> cars = new ArrayList<>();
    cars.add(new Car(new Owner("Arsyad"), "Toyota GR Yaris", 2022, 6500));
    cars.add(new Car(new Owner("Ardhan"), "Jeep Wrangler", 1972, 6000));
    cars.add(new Car(new Owner("Budhi"), "Mazda RX 87", 1967, 10500));
    cars.add(new Car(new Owner("Galuh"), "Mercedes Benz 220", 1958, 5500));
    for (int i = 0; i < cars.size(); i++) {
      cars.get(i).getDescription();
      System.out.println();
    }
  }
}
