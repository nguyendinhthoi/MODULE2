package case_study.service.person.employee;


import case_study.common.exception.ConfirmFormat;
import case_study.common.exception.IDAvailable;
import case_study.common.exception.IDNotFound;
import case_study.common.exception.InValidFormat;
import case_study.common.regex.Regex;
import case_study.model.person.Employee;
import case_study.repository.person.employee.EmployeeRepository;
import case_study.repository.person.employee.IEmployeeRepository;

import java.util.List;
import java.util.Objects;

import static case_study.view.Run.scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayEmployee() {
        List<Employee> employeeList = employeeRepository.displayEmployee();
        for (Employee s : employeeList) {
            System.out.println(s);
        }
    }


    @Override
    public void addEmployee() {
        do {
            try {
                String employeeCode = Regex.checkValidID();
                if (employeeRepository.searchIndex(employeeCode) == -1) {
                    System.out.print("Let Enter Name of Employee : ");
                    String name = scanner.nextLine();
                    System.out.print("Let Enter Date of Birth of Employee : ");
                    String date = scanner.nextLine();
                    System.out.print("Let Enter Gender of Employee : ");
                    boolean gender = Boolean.parseBoolean(scanner.nextLine());
                    System.out.print("Let Enter Identity of Employee : ");
                    String identity = scanner.nextLine();
                    System.out.print("Let Enter PhoneNumber of Employee : ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Let Enter Email of Employee : ");
                    String email = scanner.nextLine();
                    System.out.print("Let Enter Level of Employee : ");
                    String level = scanner.nextLine();
                    System.out.print("Let Enter Role of Employee : ");
                    String role = scanner.nextLine();
                    System.out.print("Let Enter Salary of Employee : ");
                    String salary = scanner.nextLine();

                    Employee employee = new Employee(employeeCode, name, date, gender, identity, phoneNumber, email, level, role, salary);
                    employeeRepository.addEmployee(employee);
                    break;
                } else {
                    displayEmployee();
                    throw new IDAvailable();
                }
            } catch (IDAvailable e) {
                System.out.println("ID Already Available!! Please Try Again!!");
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format!!");
            }
        } while (true);
    }

    //String name, String dateOfBirth, boolean gender, String identity, int phoneNumber
    // , String email, String employeeCode, String level, String role, double salary
    @Override
    public void editEmployee() {

            try {
                String employeeCode = Regex.checkValidID();
                if (employeeRepository.searchIndex(employeeCode) == -1) {
                    throw new IDNotFound();
                } else {
                    employeeRepository.showInfo(employeeCode);
                    System.out.print("Do you want to edit this employee? (yes/no) ");
                    String confirm = scanner.nextLine();

                    if (Objects.equals(confirm, "yes")) {
                        String name = Regex.checkName();
                        String date = Regex.checkDate();
                        System.out.print("Change Gender of Employee to :");
                        boolean gender = Boolean.parseBoolean(scanner.nextLine());
                        String identity = Regex.checkIdentity();
                        String phoneNumber = Regex.checkPhone();
                        System.out.print("Change Email of Employee to :");
                        String email = scanner.nextLine();
                        System.out.print("Change Level of Employee to :");
                        String level = scanner.nextLine();
                        System.out.print("Change Role of Employee to :");
                        String role = scanner.nextLine();
                        String salary = Regex.checkSalary();

                        Employee employee = new Employee(employeeCode, name, date, gender, identity, phoneNumber, email, level, role, salary);
                        employeeRepository.editEmployee(employeeCode, employee);

                    } else if (Objects.equals(confirm, "no")) {
                        System.out.println("Choose another Function!!!");

                    } else {
                        throw new ConfirmFormat();
                    }
                }
            } catch (IDNotFound e) {
                System.out.println("ID Not Found");
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format!!");
            } catch (ConfirmFormat e) {
                System.out.println("Please Just Enter yes or no!!! Try Again!!!");
            }

    }
}
