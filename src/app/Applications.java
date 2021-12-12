package app;

// ? imports a class from another package
import app.data.Products;
// ? imports all classes from another package
// import app.data.*;

public class Applications {
  public static void main(String[] args) {
    System.out.println(""); // ? this is a new line

    Products products = new Products("Mac Book Pro", 7600);
    System.out.println(products.name + " worth: " + products.price);
  }
}
