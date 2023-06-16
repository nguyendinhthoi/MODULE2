package bai_tap_them_1.service;


import bai_tap_them_1.model.Trainer;
import bai_tap_them_1.repository.TrainerRepository;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TrainerService implements ITrainerService {
    private final TrainerRepository trainerRepository = new TrainerRepository();

    @Override

    public void display() {
        List<Trainer> trainers = trainerRepository.dislay();
        for (Trainer value : trainers) {
            System.out.println(value);
        }
    }


    @Override
    public void addTrainer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Date of Birth");
        String date = scanner.nextLine();
        System.out.println("Enter Gender(True/Man ; False/Woman)");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter Role of Trainer");
        String role = scanner.nextLine();

        Trainer trainer = new Trainer(id, name, date, gender, role);
        trainerRepository.addTrainer(trainer);
    }

    @Override
    public void deleteTrainer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id you want to delete");

        int id = Integer.parseInt(scanner.nextLine());

        trainerRepository.deleteTrainer(id);

    }
}
