package case_study.common.regex;

import case_study.common.exception.InValidFormat;


import static case_study.view.Run.scanner;


public class Regex {
    public static final String EMPLOYEE_CODE = "^NV-[0-9]{4}$";
    public static final String EMPLOYEE_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]+$$";
    public static final String EMPLOYEE_IDENTITY = "^\\d{9}(\\d{3})?$";
    public static final String EMPLOYEE_PHONE = "^0\\d{9}$$";
    public static final String EMPLOYEE_SALARY = "^[1-9][^\\-]+$";
    public static final String EMPLOYEE_DATE = "^([0-2]\\d|30|31)\\-([0]\\d|10|11|12)\\-(200[0-5]|19[6-9][0-9])$";


    public static boolean validEmployee(String regex, String string) throws InValidFormat {
        if (!string.matches(regex)) {
            throw new InValidFormat();
        }
        return string.matches(regex);
    }

    public static String checkValidID() throws InValidFormat {
        String employeeCode;
        do {
            System.out.print("Let Enter Code of Employee in a Format : NV-YYYY(with Y is a number from 0 to 9)   ");
            employeeCode = scanner.nextLine();
            validEmployee(EMPLOYEE_CODE, employeeCode);
        } while (!validEmployee(EMPLOYEE_CODE, employeeCode));
        return employeeCode;
    }

    public static String checkName() throws InValidFormat {
        String name;
        do {
            System.out.print("Let Enter Name of Employee (Must Capitalize the first letter of each word): ");
            name = scanner.nextLine();
            validEmployee(EMPLOYEE_NAME, name);
        } while (!validEmployee(EMPLOYEE_NAME, name));
        return name;
    }

    public static String checkIdentity() throws InValidFormat {
        String identity;
        do {
            System.out.print("Let Enter Indentity of Employee to (contain 9 numbers or 12 numbers) :");
            identity = scanner.nextLine();
            validEmployee(EMPLOYEE_IDENTITY, identity);
        } while (!validEmployee(EMPLOYEE_IDENTITY, identity));
        return identity;
    }

    public static String checkPhone() throws InValidFormat {
        String phoneNumber;
        do {
            System.out.print("Let Enter PhoneNumber of Employee to (begin 0 and contain 10numbers) :");
            phoneNumber = scanner.nextLine();
            validEmployee(EMPLOYEE_PHONE, phoneNumber);
        } while (!validEmployee(EMPLOYEE_PHONE, phoneNumber));
        return phoneNumber;
    }

    public static String checkSalary() throws InValidFormat {
        String salary;
        do {
            System.out.print("Let Enter Salary of Employee to (>0) :");
            salary = scanner.nextLine();
            validEmployee(EMPLOYEE_SALARY, salary);
        } while (!validEmployee(EMPLOYEE_SALARY, salary));
        return salary;
    }

    public static String checkDate() throws InValidFormat {
        String date;
        do {
            System.out.print("Let Enter Date of Birth of Employee to (Format : DD-MM-YYYY with year<=2006) :");
            date = scanner.nextLine();
            validEmployee(EMPLOYEE_DATE, date);
        } while (!validEmployee(EMPLOYEE_DATE, date));
        return date;
    }

}
