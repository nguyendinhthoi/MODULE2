package case_study.model.person;

import org.jetbrains.annotations.NotNull;

public class Employee extends Person implements Comparable<Employee> {
    private String employeeCode;
    private String level;
    private String role;
    private double salary;
    public final static String COMMAA = ",";

    public Employee() {
    }

    public Employee(String employeeCode, String level, String role, double salary) {
        this.employeeCode = employeeCode;
        this.level = level;
        this.role = role;
        this.salary = salary;
    }

    public Employee(String employeeCode, String name, String dateOfBirth, String gender, String identity, String phoneNumber, String email, String level, String role, double salary) {
        super(name, dateOfBirth, gender, identity, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.role = role;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getIntoCSV() {
        return employeeCode + COMMAA + getName() + COMMAA + getDateOfBirth() + COMMAA + gender + COMMAA + getIdentity() + COMMAA + getPhoneNumber() + COMMAA + getEmail() + COMMAA + level + COMMAA + role + COMMAA + salary;
    }
    //      return employeeCode + COMMAA + getName() + COMMAA + getDateOfBirth() + COMMAA + gender + COMMAA +
    //      getIdentity() + COMMAA + getPhoneNumber() + COMMAA + getEmail() + COMMAA + level + COMMAA + role + COMMAA + salary;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", identity='" + identity + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                "VND" + '}';
    }


    @Override
    public int compareTo(Employee employee) {
        return this.employeeCode.compareTo(employee.employeeCode);
    }
}
