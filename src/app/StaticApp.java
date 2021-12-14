package app;

// ! static import
import static app.data.Country.City;
import static app.data.Constant.*;
import static app.data.Application.*;
import static app.util.MathUtil.*;

public class StaticApp {
  public static void main(String[] args) {
    System.out.println(""); // ? newline

    // ? call or run static field
    System.out.println("Application: " + APPLICATION);
    System.out.println("Version: " + VERSION);

    // ? call or run static method
    System.out.println("SUM: " + sum(23, 44, 55, 63, 12));

    // ? call or run static inner class
    City city = new City();
    city.setName("Lampung");

    System.out.println("City: " + city.getName());

    // ? call or run static block
    System.out.println("Processors: " + PROCESSORS);
  }
}
