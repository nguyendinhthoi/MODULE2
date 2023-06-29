package case_study.controller;

import case_study.service.person.employee.EmployeeService;
import case_study.service.person.employee.IEmployeeService;

import static case_study.view.Run.scanner;

public class MenuCase1 {
    public static void selectCase1() {
        IEmployeeService employeeService = new EmployeeService();
        do {
            try {
                System.out.println("-----EMPLOYEE MANAGEMENT-----\n" +
                        "1. Display list employees\n" +
                        "2. Add new employee\n" +
                        "3. Edit employee\n" +
                        "4. Return main menu");
                int chooseChild = Integer.parseInt(scanner.nextLine());
                switch (chooseChild) {
                    case 1:
                        System.out.println("-----DISPLAY MODE-----");
                        employeeService.displayEmployee();
                        break;
                    case 2:
                        System.out.println("-----ADD MODE-----");
                        employeeService.addEmployee();
                        break;
                    case 3:
                        System.out.println("-----EDIT MODE-----");
                        employeeService.editEmployee();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Function Not Found!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!!");
            }
        } while (true);
    }
}
