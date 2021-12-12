package app;

import app.data.*;

public class LocationApp {
  public static void main(String[] args) {
    System.out.println(""); // ? is a new line
    // ! Error: it is forbidden to create objects of abstract class
    // Location location = new Location("New York");

    City city = new City("New York");
    System.out.println(city.name);
  }
}
