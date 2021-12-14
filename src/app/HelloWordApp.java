package app;

import app.data.anonymous.HelloWorld;

public class HelloWordApp {
  public static void main(String[] args) {
    System.out.println(""); // ? newline

    // ? anonymous class
    HelloWorld english = new HelloWorld() {
      @Override
      public void sayHello() {
        System.out.println("Hello");
      }

      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };

    english.sayHello();
    english.sayHello("Nova Ardiansyah");
  }
}
