class Employee {
  String fullName;
  Integer age;

  Employee(String fullName, Integer age) {
    this.fullName = fullName;
    this.age = age;
  }

  void sayHello() {
    System.out.println("Hello, I'm Employee " + this.fullName + " and I'm " + this.age + " years old.");
  }
}