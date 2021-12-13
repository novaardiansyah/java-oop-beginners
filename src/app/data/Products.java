package app.data;

public class Products {
  public String name;
  public int price;

  public Products(String name, int price) {
    this.name = name;
    this.price = price;
  }

  // ? overrides the toString method
  public String toString() {
    return "Name: " + name + " Price: " + price;
  }

  // ? overrides the equals method
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof Products)) {
      return false;
    }

    // * convert to Products object
    Products products = (Products) obj;

    if (this.price != products.price) {
      return false;
    }

    if (this.name != null) {
      return this.name.equals(products.name);
    } else {
      return products.name == null;
    }

  }

}
