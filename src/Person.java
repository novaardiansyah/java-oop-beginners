class Person {
  // ? field
  String fullName;
  String address;
  final String country = "Indonesia";

  // ? constructor
  Person(String fullName, String address) {
    this.fullName = fullName;
    this.address = address;
  }

  // ? constructor overloading
  Person(String fullName) {
    this(fullName, "Jakarta");
  }

  Person() {
    this(null);
  }

  // ? method
  void sayHello() {
    System.out.println("Hello, my name is " + fullName + " and I live in " + address + ".");
  }
}
