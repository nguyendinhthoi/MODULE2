package bai_tap_them_1.controller;

import bai_tap_them_1.service.TrainerService;

import java.util.Scanner;

public class TrainerController {
    private static final TrainerService trainerService = new TrainerService();

    public static void showTrainerList() {

        Scanner scanner = new Scanner(System.in);


        boolean flag = true;
        do {
            System.out.println("--TRAINER MANAGEMENT PROGRAM--");
            System.out.println("Enter number to choose function : ");
            System.out.println("1. Add Trainer " +
                    "\n2. Delete Trainer " +
                    "\n3. Show trainer list " +
                    "\n4. Exit " +
                    "\nChoose function : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("--$-ADD TRAINER-$--");
                    trainerService.addTrainer();
                    break;
                case 2:
                    System.out.println("--$-DELETE TRAINER-$--");
                    trainerService.deleteTrainer();
                    break;
                case 3:
                    System.out.println("--$-TRAINER LIST-$--");
                    trainerService.display();
                    break;
                case 4:
                    System.out.println("The Program is Closed!!");
                    System.exit(0);
            }
        } while (flag);
    }
}
