package app;

import app.data.*;

public class AnimalApp {
  public static void main(String[] args) {
    System.out.println(""); // ? is a new line

    Animal animal = new Cat();
    animal.name = "Fluffy";
    animal.run();
  }
}
