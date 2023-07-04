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
    public static final String CUSTOMER_CODE = "^KH-[0-9]{4}$";
    public static final String VILLA_CODE = "^SVVL-\\d{4}$";
    public static final String HOUSE_CODE = "^SVHO-\\d{4}$";
    public static final String ROOM_CODE = "^SVRO-\\d{4}$";
    public static final String SERVICE_NAME = "^[A-Z][a-z]+((\\s[A-Z][a-z]+)+)?$";


    public static boolean validCheck(String regex, String string) {
        return string.matches(regex);
    }

    public static String checkID() {
        String employeeCode = null;
        do {
            try {
                System.out.print("Let Enter Code of Person in a Format : NV-YYYY(with Y is a number from 0 to 9)   ");
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
                System.out.print("Let Enter Name (Must Capitalize the first letter of each word): ");
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
                System.out.print("Let Enter Indentity (contain 9 numbers or 12 numbers) :");
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
                System.out.print("Let Enter PhoneNumber (begin 0 and contain 10numbers) :");
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
                System.out.print("Let Enter Salary  (>0) :");
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
                System.out.print("Let Enter Email (xxx@.xxx with x is a number or character) :");
                email = scanner.nextLine();
                validCheck(EMPLOYEE_EMAIL, email);
                if (!validCheck(EMPLOYEE_EMAIL, email)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(EMPLOYEE_EMAIL, email));
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
            System.out.print("Let Enter Role of Employee (Receptionist, Service, Specialist, Supervisor, Manager, Director) :");
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

    public static String checkDate() {
        String date = null;
        do {
            try {
                System.out.print("Let Enter Date of Birth (Format : DD-MM-YYYY with year<=2006) :");
                date = scanner.nextLine();
                validCheck(EMPLOYEE_DATE, date);
                if (!validCheck(EMPLOYEE_DATE, date)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(EMPLOYEE_DATE, date));
        return date;
    }

    public static String checkIDOfCust() {
        String customerCode = null;
        do {
            try {
                System.out.print("Let Enter Code of Person in a Format : KH-YYYY(with Y is a number from 0 to 9)   ");
                customerCode = scanner.nextLine();
                validCheck(CUSTOMER_CODE, customerCode);
                if (!validCheck(CUSTOMER_CODE, customerCode)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(CUSTOMER_CODE, customerCode));
        return customerCode;
    }

    public static String checkKindOfCust() {
        String[] strings = {"diamond", "platinum", "gold silver", "member"};
        boolean flag = true;
        do {
            System.out.print("Let Enter Kind of Customer (Diamond , Platinum , Gold silver , Member) :");
            String kindOfCustomer = scanner.nextLine();
            kindOfCustomer.toLowerCase();
            for (String s : strings) {
                if (s.equals(kindOfCustomer)) {
                    return capitalizeFirst(kindOfCustomer);
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                System.out.println("Incorrect by Menu");
            }
        } while (true);
    }

    public static String checkHouseCode() {
        String id = null;
        do {
            try {
                System.out.print("Let Enter Code of House in a Format : SVHO-YYYY(with Y is a number from 0 to 9)   ");
                id = scanner.nextLine();
                validCheck(HOUSE_CODE, id);
                if (!validCheck(HOUSE_CODE, id)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(HOUSE_CODE, id));
        return id;
    }

    public static String checkVillaCode() {
        String id = null;
        do {
            try {
                System.out.print("Let Enter Code of House in a Format : SVVL-YYYY(with Y is a number from 0 to 9)   ");
                id = scanner.nextLine();
                validCheck(VILLA_CODE, id);
                if (!validCheck(VILLA_CODE, id)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(VILLA_CODE, id));
        return id;
    }

    public static String checkRoomCode() {
        String id = null;
        do {
            try {
                System.out.print("Let Enter Code of House in a Format : SVRO-YYYY(with Y is a number from 0 to 9)   ");
                id = scanner.nextLine();
                validCheck(ROOM_CODE, id);
                if (!validCheck(ROOM_CODE, id)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(ROOM_CODE, id));
        return id;
    }

    public static String checkNameService() {
        String name = null;
        do {
            try {
                System.out.print("Let Enter Name of Service (Must Capitalize the first letter of each word):    ");
                name = scanner.nextLine();
                validCheck(SERVICE_NAME, name);
                if (!validCheck(SERVICE_NAME, name)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(SERVICE_NAME, name));
        return name;
    }

    public static double checkPoolArea() {
        double poolArea;
        do {
            try {
                System.out.print("Let Enter Pool Area (>30m2) :");
                poolArea = Double.parseDouble(scanner.nextLine());
                if (poolArea < 30) {
                    throw new InValidFormat();
                } else {
                    return poolArea;
                }
            } catch (InValidFormat e) {
                System.out.println("Enter Number > 30m2");
            }
        } while (true);
    }

    public static double checkUsualArea() {
        double area;
        do {
            try {
                System.out.print("Let Enter Pool Area (>30m2) :");
                area = Double.parseDouble(scanner.nextLine());
                if (area < 30) {
                    throw new InValidFormat();
                } else {
                    return area;
                }
            } catch (InValidFormat e) {
                System.out.println("Enter Number > 30m2");
            }
        } while (true);
    }

    public static double checkRentCost() {
        double cost;
        do {
            try {
                System.out.print("Let Enter Rent Cost (>0) :");
                cost = Double.parseDouble(scanner.nextLine());
                if (cost < 0) {
                    throw new InValidFormat();
                } else {
                    return cost;
                }
            } catch (InValidFormat e) {
                System.out.println("Enter Number > 0");
            }
        } while (true);
    }

    public static int checkMaxPeople() {
        int people;
        do {
            try {
                System.out.print("Let Enter Number of People (0 < People < 20) :");
                people = Integer.parseInt(scanner.nextLine());
                if (people < 0 || people > 20) {
                    throw new InValidFormat();
                } else {
                    return people;
                }
            } catch (InValidFormat e) {
                System.out.println("Enter Number of People > 0 and < 20");
            }
        } while (true);
    }

    public static int checkNumberOfFloor() {
        int floor;
        do {
            try {
                System.out.print("Let Enter Rent Cost (>0) :");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor < 0) {
                    throw new InValidFormat();
                } else {
                    return floor;
                }
            } catch (InValidFormat e) {
                System.out.println("Enter Number > 0");
            }
        } while (true);
    }

    public static String checkRentalType() {
        String rentalType = null;
        do {
            try {
                System.out.print("Let Enter Rental Type (Must Capitalize the first letter of each word):    ");
                rentalType = scanner.nextLine();
                validCheck(SERVICE_NAME, rentalType);
                if (!validCheck(SERVICE_NAME, rentalType)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(SERVICE_NAME, rentalType));
        return rentalType;
    }

    public static String checkKindOfRoom() {
        String kindOfRoom = null;
        do {
            try {
                System.out.print("Let Enter Kind of Room (Must Capitalize the first letter of each word):    ");
                kindOfRoom = scanner.nextLine();
                validCheck(SERVICE_NAME, kindOfRoom);
                if (!validCheck(SERVICE_NAME, kindOfRoom)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(SERVICE_NAME, kindOfRoom));
        return kindOfRoom;
    }

    public static String checkFreeService() {
        String freeService = null;
        do {
            try {
                System.out.print("Let Enter Free Service (Must Capitalize the first letter of each word):    ");
                freeService = scanner.nextLine();
                validCheck(SERVICE_NAME, freeService);
                if (!validCheck(SERVICE_NAME, freeService)) {
                    throw new InValidFormat();
                }
            } catch (InValidFormat e) {
                System.out.println("Incorrect Format");
            }
        } while (!validCheck(SERVICE_NAME, freeService));
        return freeService;
    }


}
