package case_study.controller;

import static case_study.view.Run.scanner;

public class MenuCase3 {
    public static void selectCase3() {
        do {
            try {
                System.out.println("-----FACILITY MANAGEMENT-----\n" +
                        "1. Display list facility\n" +
                        "2. Add new facility\n" +
                        "3. Display list facility maintenance\n" +
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
                        System.out.println("-----DISPLAY LIST MAINTENANCE-----");
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
