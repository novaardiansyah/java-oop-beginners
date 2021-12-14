package app;

import app.data.Country;
import app.data.Application;
import app.data.Constant;
import app.util.MathUtil;

public class StaticApp {
  public static void main(String[] args) {
    System.out.println(""); // ? newline

    // ? call or run static field
    System.out.println("Application: " + Constant.APPLICATION);
    System.out.println("Version: " + Constant.VERSION);

    // ? call or run static method
    System.out.println("SUM: " + MathUtil.sum(23, 44, 55, 63, 12));

    // ? call or run static inner class
    Country.City city = new Country.City();
    city.setName("Lampung");

    System.out.println("City: " + city.getName());

    // ? call or run static block
    System.out.println("Processors: " + Application.PROCESSORS);
  }
}
