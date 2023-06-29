package case_study.controller;

import static case_study.view.Run.scanner;

public class FuramaController {
    public void displayMainMenu() {
        do {
            try {
                System.out.print("-----FURAMA MANAGEMENT PROGRAMING-----\n" +
                        "1. Employee Management\n" +
                        "2. Customer Management\n" +
                        "3. Facility Management\n" +
                        "4. Booking Management\n" +
                        "5. Promotion Management\n" +
                        "6. Exit\n" +
                        "Choose Function in here : ");
                int chooseMain = Integer.parseInt(scanner.nextLine());
                switch (chooseMain) {
                    case 1:
                        MenuCase1.selectCase1();
                        break;
                    case 2:
                        MenuCase2.selectCase2();
                        break;
                    case 3:
                        MenuCase3.selectCase3();
                        break;
                    case 4:
                        MenuCase4.selectCase4();
                        break;
                    case 5:
                        MenuCase5.selectCase5();
                        break;
                    case 6:
                        System.out.println("-----The Program Closed-----");
                        System.exit(0);
                    default:
                        System.out.println("Function Not Found!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please Enter Number!!");
            }
        } while (true);
    }
}
