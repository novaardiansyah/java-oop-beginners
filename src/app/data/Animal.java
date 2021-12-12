package app.data;

public abstract class Animal {
  public String name;

  /**
   * ! Abstract method
   * all children must make this method override
   */
  public abstract void run();
}
