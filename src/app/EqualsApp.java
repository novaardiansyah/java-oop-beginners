package app;

public class EqualsApp {
  public static void main(String[] args) {
    System.out.println(""); // ? is a new line

    String first = "Nova";
    first = first + " " + "Ardiansyah";

    System.out.println(first);

    String second = "Nova Ardiansyah";
    System.out.println(second);

    /**
     * ? check equality by using ==
     * the result is false
     * because String is an object
     * then what is actually checked is its location in memory
     */
    System.out.println(first == second);

    /**
     * ? check equality by using equals()
     * the result is true
     * because String is an object
     * then what is actually checked is its content
     */
    System.out.println(first.equals(second));
  }
}
