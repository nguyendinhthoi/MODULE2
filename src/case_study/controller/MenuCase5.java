package case_study.controller;

import static case_study.view.Run.scanner;

public class MenuCase5 {
    public static void selectCase5() {
        do {
            try {
                System.out.println("-----PROMOTION MANAGEMENT-----\n" +
                        "1. Display list customers use service\n" +
                        "2. Display list customers get voucher\n" +
                        "3. Return main menu");
                int chooseChild = Integer.parseInt(scanner.nextLine());
                switch (chooseChild) {
                    case 1:
                        System.out.println("-----DISPLAY LIST USE SERVICE-----");
                        break;
                    case 2:
                        System.out.println("-----DISPLAY LIST USE VOUCHER-----");
                        break;
                    case 3:
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
