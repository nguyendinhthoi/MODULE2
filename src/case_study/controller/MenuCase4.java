package case_study.controller;

import static case_study.view.Run.scanner;

public class MenuCase4 {
    public static void selectCase4() {
        do {
            try {
                System.out.println("-----BOOKING MANAGEMENT-----" +
                        "1. Add new booking\n" +
                        "2. Display list booking\n" +
                        "3. Create new contracts\n" +
                        "4. Display list contracts\n" +
                        "5. Edit contracts\n" +
                        "6. Return main menu");
                int chooseChild = Integer.parseInt(scanner.nextLine());
                switch (chooseChild) {
                    case 1:
                        System.out.println("-----ADD MODE-----");
                        break;
                    case 2:
                        System.out.println("-----DISPLAY MODE-----");
                        break;
                    case 3:
                        System.out.println("-----CREATE NEW CONTRACTS-----");
                        break;
                    case 4:
                        System.out.println("-----DISPLAY LIST CONTRACTS-----");
                        break;
                    case 5:
                        System.out.println("-----EDIT CONTRACTS-----");
                        break;
                    case 6:
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
