package app;

public class StackTraceApp {
  public static void main(String[] args) {
    System.out.println(""); // ? newline

    try {
      String[] names = {
          "John Doe", "Leonard", "Lena Doe"
      };

      System.out.println(names[10]);
    } catch (Throwable throwable) {
      // ? use first step
      // StackTraceElement[] stackTraceElements = throwable.getStackTrace();

      // ? or use second step
      throwable.printStackTrace();
    }
  }
}
