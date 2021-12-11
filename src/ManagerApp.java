public class ManagerApp {
  public static void main(String[] args) {
    System.out.println("");

    // ? parent
    var manager = new Manager();
    manager.fullName = "John Smith";
    manager.age = 30;
    manager.sayHello();

    // ? child
    var vicePresident = new VicePresident();
    vicePresident.fullName = "Jane Doe";
    vicePresident.age = 25;
    vicePresident.sayHello();
  }
}
