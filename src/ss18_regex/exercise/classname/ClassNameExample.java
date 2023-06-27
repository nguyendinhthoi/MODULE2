package ss18_regex.exercise.classname;

import java.util.Scanner;

public class ClassNameExample {
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

    ClassNameExample() {
    }

    public boolean validClassName(String regex, String s) {
        return s.matches(regex);
    }

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Enter name to check (begin with" + ANSI_BLUE + " (C or P or A) " + ANSI_RESET + "and" + ANSI_BLUE + " 4 number" + ANSI_RESET + " and" + ANSI_BLUE + " (G or H or I or K)" + ANSI_RESET + " for the last) :");
                String className = scanner.nextLine();
                boolean result = classNameExample.validClassName(CLASSNAME_REGEX, className);
                if (!result) {
                    throw new NonValid();
                } else {
                    System.out.println(ANSI_RED + "Your classname " + className + " is valid!!!" + ANSI_RESET);
                    flag = false;
                }
            } catch (NonValid e) {
                System.out.println(ANSI_RED + "Your classname is invalid!!" + ANSI_RESET);
            }
        }

    }
}
