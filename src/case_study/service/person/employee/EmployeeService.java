package case_study.service.person.employee;


import case_study.common.exception.ConfirmFormat;
import case_study.common.exception.IDAvailable;
import case_study.common.exception.IDNotFound;
import case_study.common.exception.InValidFormat;
import case_study.common.regex.Regex;
import case_study.common.regex.Regex1;
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
                    String name = Regex1.checkName();
                    String date = Regex.checkDate();
                    String gender = Regex1.checkGender();
                    String identity = Regex1.checkIdentity();
                    String phoneNumber = Regex1.checkPhone();
                    String email = Regex1.checkEmail();
                    String level = Regex1.checkLevels();
                    String role = Regex1.checkRole();
                    double salary = Regex1.checkSalary();

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
        do {
            try {
                String employeeCode = Regex1.checkID();
                if (employeeRepository.searchIndex(employeeCode) == -1) {
                    throw new IDNotFound();
                } else {
                    employeeRepository.showInfo(employeeCode);
                    System.out.print("Do you want to edit this employee? (yes/no) ");
                    String confirm = scanner.nextLine();

                    if (Objects.equals(confirm, "yes")) {
                        String name = Regex1.checkName();
                        String date = Regex.checkDate();
                        String gender = Regex1.checkGender();
                        String identity = Regex1.checkIdentity();
                        String phoneNumber = Regex1.checkPhone();
                        String email = Regex1.checkEmail();
                        String level = Regex1.checkLevels();
                        String role = Regex1.checkRole();
                        double salary = Regex1.checkSalary();

                        Employee employee = new Employee(employeeCode, name, date, gender, identity, phoneNumber, email, level, role, salary);
                        employeeRepository.editEmployee(employeeCode, employee);
                        break;
                    } else if (Objects.equals(confirm, "no")) {
                        System.out.println("Choose another Function!!!");
                        break;
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
        } while (true);
    }
}
