package ss18_regex.exercise.phone_number;

import java.util.Scanner;

public class PhoneNumber {
    private final static String PHONENUMBER_REGEX = "^\\(84\\)-\\(0\\d{9}\\)$";
    private final static String CLASSNAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    PhoneNumber() {

    }

    public boolean validPhoneNumber(String regex, String string) {
        return string.matches(regex);
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter phone number to check " + ANSI_BLUE + " (84)-(0xxxxxxxxx) (with x is number,this have 10x .EXP:(84)-(0123456789) ) :" + ANSI_RESET);
                String number = scanner.nextLine();
                boolean check = phoneNumber.validPhoneNumber(PHONENUMBER_REGEX, number);
                if (!check) {
                    throw new NonValid();
                } else {
                    System.out.println("The phone " + ANSI_BLUE + number + ANSI_RESET + " is valid");
                    break;
                }
            } catch (NonValid e) {
                System.out.println(ANSI_RED + "The phone is invalid!!" + ANSI_RESET);
            }
        }
    }
}
