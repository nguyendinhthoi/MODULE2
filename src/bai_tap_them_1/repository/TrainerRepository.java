package bai_tap_them_1.repository;

import bai_tap_them_1.model.Trainer;

import java.util.ArrayList;
import java.util.List;

public class TrainerRepository implements ITrainerRepository {
    static List<Trainer> trainerList = new ArrayList<>();

    static {
        trainerList.add(new Trainer(1, "TrungTH", "20/01/1995", true, "Tutor"));
        trainerList.add(new Trainer(2, "ChánhTV", "21/02/1996", true, "Instructor"));
        trainerList.add(new Trainer(1, "QuangNN", "22/03/1997", true, "Coach"));
    }

    @Override
    public List<Trainer> dislay() {
        return trainerList;
    }

    @Override
    public void addTrainer() {

    }

    @Override
    public void deleteTrainer() {

    }
}
