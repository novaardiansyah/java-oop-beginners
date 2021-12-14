package app;

import app.data.LoginRequest;
import app.error.ValidationException;
import app.util.ValidationUtil;

public class ValidationApp {
  public static void main(String[] args) {
    System.out.println(""); // ? newline

    /**
     * ! Checked Exception
     * need to use block catch()
     */
    LoginRequest loginRequest = new LoginRequest(null, null);

    try {
      ValidationUtil.validate(loginRequest);
    } catch (ValidationException | NullPointerException error) {
      System.out.println(error.getMessage());
    } finally {
      System.out.println("Finally Keyword");
    }

    /**
     * ! Runtime Exception
     * no need to use block catch()
     */
    LoginRequest loginRequest2 = new LoginRequest("username", null);
    ValidationUtil.validateRuntime(loginRequest2);
  }
}
