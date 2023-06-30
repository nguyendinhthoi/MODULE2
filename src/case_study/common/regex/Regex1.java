package case_study.common.regex;

import case_study.common.exception.IDNotFound;
import case_study.common.exception.InValidFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static case_study.view.Run.scanner;

public class Regex1 {
    public static final String EMPLOYEE_CODE = "^NV-[0-9]{4}$";
    public static final String EMPLOYEE_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]+$$";
    public static final String EMPLOYEE_IDENTITY = "^\\d{9}(\\d{3})?$";
    public static final String EMPLOYEE_PHONE = "^0\\d{9}$";
    public static final String EMPLOYEE_DATE = "^([0-2]\\d|30|31)\\-([0]\\d|10|11|12)\\-(200[0-5]|19[6-9][0-9])$";
    private static final String EMPLOYEE_EMAIL = "^[a-z](\\w+)?@[a-z]{2,}\\.[a-z]+(\\.[a-z]+)?$";
    private static final String EMPLOYEE_GENDER = "^Man|Woman$";

    public static boolean validCheck(String regex, String string) {
        return string.matches(regex);
    }

    public static String checkID() {
        String employeeCode = null;
        do {
            try {
                System.out.print("Let Enter Code of Employee in a Format : NV-YYYY(with Y is a number from 0 to 9)   ");
                employeeCode = scanner.nextLine();
                validCheck(EMPLOYEE_CODE, employeeCode);
                if (!validCheck(EMPLOYEE_CODE, employeeCode)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(EMPLOYEE_CODE, employeeCode));
        return employeeCode;
    }

    public static String checkName() {
        String name = null;
        do {
            try {
                System.out.print("Let Enter Name of Employee (Must Capitalize the first letter of each word): ");
                name = scanner.nextLine();
                validCheck(EMPLOYEE_NAME, name);
                if (!validCheck(EMPLOYEE_NAME, name)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(EMPLOYEE_NAME, name));
        return name;
    }

    public static String checkIdentity() {
        String identity = null;
        do {
            try {
                System.out.print("Let Enter Indentity of Employee to (contain 9 numbers or 12 numbers) :");
                identity = scanner.nextLine();
                validCheck(EMPLOYEE_IDENTITY, identity);
                if (!validCheck(EMPLOYEE_IDENTITY, identity)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(EMPLOYEE_IDENTITY, identity));
        return identity;
    }

    public static String checkPhone() {
        String phoneNumber = null;
        do {
            try {
                System.out.print("Let Enter PhoneNumber of Employee to (begin 0 and contain 10numbers) :");
                phoneNumber = scanner.nextLine();
                validCheck(EMPLOYEE_PHONE, phoneNumber);
                if (!validCheck(EMPLOYEE_PHONE, phoneNumber)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(EMPLOYEE_PHONE, phoneNumber));
        return phoneNumber;
    }

    public static double checkSalary() {
        double salary;
        do {
            try {
                System.out.print("Let Enter Salary of Employee to (>0) :");
                salary = Double.parseDouble(scanner.nextLine());
                if (salary < 0) {
                    throw new InValidFormat();
                } else {
                    return salary;
                }
            } catch (InValidFormat e) {
                System.out.println("Enter Number > 0");
            }
        } while (true);
    }

    public static String checkEmail() {
        String email = null;
        do {
            try {
                System.out.print("Let Enter Email of Employee to (xxx@.xxx with x is a number or character) :");
                email = scanner.nextLine();
                validCheck(EMPLOYEE_EMAIL, email);
                if (!validCheck(EMPLOYEE_EMAIL, email)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(EMPLOYEE_PHONE, email));
        return email;
    }

    public static String capitalizeFirst(String string) {
        String capitalizedStr = string.substring(0, 1).toUpperCase() + string.substring(1);
        return capitalizedStr;
    }

    public static String checkLevels() {
        String[] strings = {"intermediate", "college", "university", "graduate"};
        boolean flag = true;
        do {
            System.out.println("Let Enter Levels of Employee (Intermediate, College, University and Graduate) :");
            String levels1 = scanner.nextLine();
            String levels = levels1.toLowerCase();
            for (String s : strings) {
                if (s.equals(levels)) {
                    return capitalizeFirst(levels);
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                System.out.println("Incorrect by Menu");
            }
        } while (true);
    }

    public static String checkRole() {
        String[] strings = {"receptionist", "service", "specialist", "supervisor", "manager", "director"};
        boolean flag = true;
        do {
            System.out.println("Let Enter Role of Employee (Receptionist, Service, Specialist, Supervisor, Manager, Director) :");
            String role = scanner.nextLine();
            role.toLowerCase();
            for (String s : strings) {
                if (s.equals(role)) {
                    return capitalizeFirst(role);
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                System.out.println("Incorrect by Menu");
            }
        } while (true);
    }

    public static String checkGender() {
        String gender = null;
        do {
            try {
                System.out.print("Let Enter Man or Woman : ");
                gender = scanner.nextLine();
                validCheck(EMPLOYEE_GENDER, gender);
                if (!validCheck(EMPLOYEE_GENDER, gender)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(EMPLOYEE_GENDER, gender));
        return gender;
    }

}
