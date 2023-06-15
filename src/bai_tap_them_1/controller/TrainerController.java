package bai_tap_them_1.controller;

import bai_tap_them_1.service.TrainerService;

import java.util.Scanner;

public class TrainerController {
    private static final TrainerService trainerService = new TrainerService();

    public static void showTrainerList() {

        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());

        boolean flag = true;
        do {
            System.out.println("--TRAINER MANAGEMENT PROGRAM--");
            System.out.println("Enter number to choose function : ");
            System.out.println("1. Add Trainer " +
                    "\n2. Delete Trainer " +
                    "\n3. Show trainer list " +
                    "\n4. Exit " +
                    "Choose function : ");
            switch (choose) {
                case 1:
                case 2:
                case 3:
                    System.out.println("--$-TRAINER LIST-$--");
                    trainerService.display();
                case 4:
                    System.out.println("The Program is Closed!!");
                    System.exit(0);
            }
        } while (flag);

    }
}
