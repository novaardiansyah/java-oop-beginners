package app;

import app.data.Car;
import app.data.Avanza;

public class CarApp {
  public static void main(String[] args) {
    System.out.println(""); // ? is a new line
    Car car = new Avanza();
    System.out.println(car.getTire());
    car.drive();
  }

}
