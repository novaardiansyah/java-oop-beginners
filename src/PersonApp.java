public class PersonApp {
  public static void main(String[] args) {
    System.out.println(""); // give distance
    // var person = new Person();

    // person.fullName = "John Doe";
    // person.address = "123 Main St.";

    // System.out.println(person.fullName);
    // System.out.println(person.address);

    // var person1 = new Person();
    // person1.sayHello("Jane Doe");

    // ? constructor overloading
    var person = new Person("John Doe", "123 Main St.");
    person.sayHello();

    var person1 = new Person("Jane Doe");
    person1.sayHello();

    var person2 = new Person();
    person2.sayHello();
  }
}
