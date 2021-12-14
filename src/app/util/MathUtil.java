package app.util;

public class MathUtil {
  // ! static method
  public static int sum(int... values) {
    int total = 0;

    // ? foreach in java
    for (var value : values) {
      total += value;
    }

    return total;
  }
}
