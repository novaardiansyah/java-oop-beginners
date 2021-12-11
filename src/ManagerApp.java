public class ManagerApp {
  public static void main(String[] args) {
    System.out.println("");

    // ? parent
    var manager = new Manager("john smith", 20);
    manager.sayHello();

    // ? child
    var vicePresident = new VicePresident("jane doe", 30);
    vicePresident.sayHello();
  }
}
