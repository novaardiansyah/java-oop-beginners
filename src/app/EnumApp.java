package app;

import app.data.Customer;
import app.data.Level;

public class EnumApp {
  public static void main(String[] args) {
    System.out.println(""); // ? newline

    Customer customer = new Customer();
    customer.setName("Nova Ardiansyah");
    customer.setLevel(Level.VIP);

    System.out.println("Fullname: " + customer.getName());
    System.out.println("Level: " + customer.getLevel());
    System.out.println("Description: " + customer.getLevel().getDescription());

    System.out.println(""); // ? newline

    // ? convert to String
    String levelName = Level.PREMIUM.name();
    System.out.println(levelName);

    // ? convert to Object
    Level level = Level.valueOf("STANDART");
    System.out.println(level);

    // ? convert to Array
    Level[] levels = Level.values();
    System.out.println("\nArray Level:");
    for (var value : levels) {
      System.out.println(value);
    }
  }
}
