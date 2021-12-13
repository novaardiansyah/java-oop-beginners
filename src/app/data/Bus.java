package app.data;

public class Bus implements Car {

  public void drive() {
    System.out.println("Bus is driving");
  }

  public int getTire() {
    return 12;
  }

  public String getBrand() {
    return "Toyota";
  }

  public boolean isMaintenance() {
    return false;
  }

  /**
   * ! default method interface
   * allowed not to be overridden
   */
  public boolean isBig() {
    return true;
  }

}
