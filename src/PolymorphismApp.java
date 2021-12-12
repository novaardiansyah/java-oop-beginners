public class PolymorphismApp {
  public static void main(String[] args) {
    System.out.println(""); // ? this is a new line

    // Employee employee = new Employee("Nova Ardiansyah", 23);
    // employee.sayHello();

    // employee = new Manager("Dea Setiana Wati", 21);
    // employee.sayHello();

    // employee = new VicePresident("Aditiya Saputra", 14);
    // employee.sayHello();

    sayHello(new Employee("Nova Ardiansyah", 23));
    sayHello(new Manager("Dea Setiana Wati", 21));
    sayHello(new VicePresident("Aditiya Saputra", 14));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      // * casts the object to VicePresident
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println(
          "Hello, I'm VicePresident " + vicePresident.fullName + " and I'm " + vicePresident.age + " years old.");
    } else if (employee instanceof Manager) {
      // * casts the object to Manager
      Manager manager = (Manager) employee;
      System.out.println(
          "Hello, I'm Manager " + manager.fullName + " and I'm " + manager.age + " years old.");
    } else {
      System.out.println(
          "Hello, I'm Employee " + employee.fullName + " and I'm " + employee.age + " years old.");
    }
  }
}
