package app.data;

// ? outer class
public class Company {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // ? inner class
  public class Employee {
    private String name;
    private int salary;

    // ? accessing methods from outer clas
    public String getCompany() {
      return Company.this.getName();
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getSalary() {
      return salary;
    }

    public void setSalary(int salary) {
      this.salary = salary;
    }

  }
}
