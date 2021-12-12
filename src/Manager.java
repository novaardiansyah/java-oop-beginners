class Manager extends Employee {
  Manager(String fullName, Integer age) {
    super(fullName, age);
  }

  void sayHello() {
    System.out.println("Hello, I'm Manager " + this.fullName + " and I'm " + this.age + " years old.");
  }
}
