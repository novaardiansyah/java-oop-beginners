package app;

import app.data.Products;

public class ProductsApp {
  public static void main(String[] args) {
    System.out.println(""); // ? this is a new line

    Products product = new Products("Mac Book Pro", 7600);
    System.out.println(product);

    Products product2 = new Products("Mac Book Pro", 7600);
    System.out.println(product.equals(product2));
  }
}
