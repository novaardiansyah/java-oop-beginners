package app.util;

import app.data.LoginRequest;
import app.error.BlankException;
import app.error.ValidationException;

public class ValidationUtil {
  public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
    if (loginRequest.getUsername() == null) {
      throw new NullPointerException("username cannot be null");
    } else if (loginRequest.getUsername().isBlank()) {
      throw new ValidationException("username cannot be empty");
    } else if (loginRequest.getPassword() == null) {
      throw new NullPointerException("password cannot be null");
    } else if (loginRequest.getPassword().isBlank()) {
      throw new ValidationException("password cannot be empty");
    }
  }

  /**
   * ! Runtime Exception
   * it is not mandatory to give throws keyword
   * not required to catch the error with catch()
   */
  public static void validateRuntime(LoginRequest loginRequest) {
    if (loginRequest.getUsername() == null) {
      throw new NullPointerException("username cannot be null");
    } else if (loginRequest.getUsername().isBlank()) {
      throw new BlankException("username cannot be empty");
    } else if (loginRequest.getPassword() == null) {
      throw new NullPointerException("password cannot be null");
    } else if (loginRequest.getPassword().isBlank()) {
      throw new BlankException("password cannot be empty");
    }
  }

}
