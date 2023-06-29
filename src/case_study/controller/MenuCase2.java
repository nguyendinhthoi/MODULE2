package case_study.controller;

import static case_study.view.Run.scanner;

public class MenuCase2 {
    public static void selectCase2() {
        do {
            try {
                System.out.println("-----CUSTOMER MANAGEMENT-----\n" +
                        "1. Display list customers\n" +
                        "2. Add new customer\n" +
                        "3. Edit customer\n" +
                        "4. Return main menu");
                int chooseChild = Integer.parseInt(scanner.nextLine());
                switch (chooseChild) {
                    case 1:
                        System.out.println("-----DISPLAY MODE-----");
                        break;
                    case 2:
                        System.out.println("-----ADD MODE-----");
                        break;
                    case 3:
                        System.out.println("-----EDIT MODE-----");
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