package app;

import app.data.CreateUserRequest;
import app.util.ValidationUtil;

public class ReflectionApp {
  public static void main(String[] args) {
    CreateUserRequest createUserRequest = new CreateUserRequest();
    createUserRequest.setUsername("Nova Ardianysah");

    ValidationUtil.validationReflection(createUserRequest);
  }
}
