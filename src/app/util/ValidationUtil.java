package app.util;

import java.lang.reflect.Field;

import app.annotation.NotBlank;
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

  public static void validationReflection(Object object) {
    Class class1 = object.getClass();
    Field[] fields = class1.getDeclaredFields();

    for (var field : fields) {
      field.setAccessible(true);
      if (field.getAnnotation(NotBlank.class) != null) {
        // ? validate
        try {
          String value = (String) field.get(object);

          if (value == null) {
            throw new NullPointerException("value cannot be null");
          } else if (value.isBlank()) {
            throw new BlankException("value cannot be empty");
          }

        } catch (IllegalAccessException exception) {
          System.out.println(exception.getMessage());
        }
      }
    }
  }
}
