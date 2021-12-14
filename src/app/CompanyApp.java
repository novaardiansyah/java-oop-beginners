package app;

import app.data.Company;

public class CompanyApp {
  public static void main(String[] args) {
    System.out.println(""); // ? is a new line

    Company company = new Company();
    company.setName("Google");

    Company.Employee employee = company.new Employee();
    employee.setName("Nova Ardiansyah");
    employee.setSalary(300);

    System.out.println("Company: " + employee.getCompany());
    System.out.println("Employee: " + employee.getName());
    System.out.println("Salary: " + employee.getSalary());
  }
}
