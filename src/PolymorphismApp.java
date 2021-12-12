public class PolymorphismApp {
  public static void main(String[] args) {
    System.out.println(""); // ? this is a new line

    Employee employee = new Employee("Nova Ardiansyah", 23);
    employee.sayHello();

    employee = new Manager("Dea Setiana Wati", 21);
    employee.sayHello();

    employee = new VicePresident("Aditiya Saputra", 14);
    employee.sayHello();

    System.out.println(""); // ? this is a new line

    sayHello(new Employee("Nova Ardiansyah", 23));
    sayHello(new Manager("Dea Setiana Wati", 21));
    sayHello(new VicePresident("Aditiya Saputra", 14));
  }

  static void sayHello(Employee employee) {
    System.out.println("Hello " + employee.fullName);
  }
}
