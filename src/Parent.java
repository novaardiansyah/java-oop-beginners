class Parent {
  String fullName;

  void doSomething() {
    System.out.println("Doing something in Parent");
  }
}

class Child extends Parent {
  String fullName;

  void doSomething() {
    System.out.println("Doing something in Child");
  }
}