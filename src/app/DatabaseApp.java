package app;

import app.error.DatabaseError;

public class DatabaseApp {
  public static void main(String[] args) {
    System.out.println(""); // ? newline
    connectDatabase("username", null);
  }

  public static void connectDatabase(String username, String password) {
    if (username == null || password == null) {
      /**
       * ! Error Exception
       * it is not recommended to use try-catch
       * the application will be automatically dismissed
       */
      throw new DatabaseError("can't connect to database");
    }
  }
}