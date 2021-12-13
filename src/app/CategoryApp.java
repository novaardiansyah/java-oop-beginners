package app;

import app.data.Category;

public class CategoryApp {
  public static void main(String[] args) {
    System.out.println(""); // ? is a new line

    Category category = new Category();
    category.setId("CAT_001");

    System.out.println("Category ID: " + category.getId());
  }
}
