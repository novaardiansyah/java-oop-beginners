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

  // ? overrides the hashCode method
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + price;
    return result;
  }

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Products other = (Products) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (price != other.price)
      return false;
    return true;
  }

}
