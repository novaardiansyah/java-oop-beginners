package app.data;

public class Avanza implements Car {
  public boolean isMaintenance() {
    return false;
  }

  public String getBrand() {
    return "Toyota";
  }

  public void drive() {
    System.out.println("Avanza is driving");
  }

  public int getTire() {
    return 4;
  }
}
