package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import app.annotation.Fancy;

// ? Annotations
@Fancy(name = "ReadApp", tags = { "Java", "Application" })
public class ReadApp {
  public static void main(String[] args) {
    System.out.println(""); // ? newline

    BufferedReader reader = null;

    // ! manual try-catch
    try {
      reader = new BufferedReader(new FileReader("README.md"));

      while (true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        }
        System.out.println(line);
      }
    } catch (Throwable throwable) {
      System.out.println(throwable.getMessage());
    } finally {
      if (reader != null) {
        try {
          reader.close();
          System.out.println("\nFinished closing the process");
        } catch (IOException IoException) {
          System.out.println(IoException.getMessage());
        }
      }
    }

    // ! try-with-resources
    try (BufferedReader reader2 = new BufferedReader(new FileReader("README.md"))) {
      while (true) {
        String line = reader2.readLine();
        if (line == null) {
          break;
        }
        System.out.println(line);
      }
    } catch (IOException IoException) {
      System.out.println(IoException.getMessage());
    }
  }
}