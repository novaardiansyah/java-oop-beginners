package app;

import app.data.Products;

public class ProductsApp {
  public static void main(String[] args) {
    System.out.println(""); // ? this is a new line

    Products products = new Products("Mac Book Pro", 7600);
    System.out.println(products);
  }
}
