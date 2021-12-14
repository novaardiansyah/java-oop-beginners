package app.util;

import app.data.LoginRequest;
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
}
