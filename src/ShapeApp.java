public class ShapeApp {
  public static void main(String[] args) {
    System.out.println(""); // ? is a new line

    var shape = new Shape();
    System.out.println(shape.getCorner());

    var rectangle = new Rectangle();
    System.out.println(rectangle.getCorner());
    // * super keyword
    System.out.println(rectangle.getParentCorner());
  }
}
