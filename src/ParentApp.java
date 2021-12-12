public class ParentApp {
  public static void main(String[] args) {
    System.out.println(""); // ? this is a new line

    Child child = new Child();
    child.fullName = "John Doe";

    child.doSomething();
    System.out.println(child.fullName);

    System.out.println(""); // ? this is a new line

    Parent parent = (Parent) child;
    /**
     * ! Method Overriding
     * when using a method that is on a child in the parent,
     * then the parent method will be overridden,
     * so that the method that will be called is the method that exists in the child
     */
    parent.doSomething();

    /**
     * ! Variable Hidding
     * when using child variable in parent, child variable will be hidden
     * and the parent variable will be the chosen one
     */
    parent.fullName = "Jane Doe";
    System.out.println(parent.fullName);
  }
}
