package bai_tap_them_1.service;


import bai_tap_them_1.model.Trainer;
import bai_tap_them_1.repository.TrainerRepository;
import java.util.List;

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

    }

    @Override
    public void deleteTrainer() {

    }
}
