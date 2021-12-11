class Manager {
  String fullName;
  Integer age;

  Manager(String fullName, Integer age) {
    this.fullName = fullName;
    this.age = age;
  }

  void sayHello() {
    System.out.println("Hello, I'm Manager " + fullName + " and I'm " + age + " years old.");
  }
}
