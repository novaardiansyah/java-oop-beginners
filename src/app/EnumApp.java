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
  }
}
