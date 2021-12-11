class VicePresident extends Manager {
  // ? super constructor
  VicePresident(String fullName, Integer age) {
    super(fullName, age);
  }

  void sayHello() {
    System.out.println("Hello, I'm Vice President " + fullName + " and I'm " + age + " years old.");
  }
}
