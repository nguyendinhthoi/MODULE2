package bai_tap_them_1.repository;

import bai_tap_them_1.model.Trainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrainerRepository implements ITrainerRepository {
    static List<Trainer> trainerList = new ArrayList<>();

    static {
        trainerList.add(new Trainer(1, "TrungTH", "20/01/1995", true, "Tutor"));
        trainerList.add(new Trainer(2, "ChánhTV", "21/02/1996", true, "Instructor"));
        trainerList.add(new Trainer(3, "QuangNN", "22/03/1997", true, "Coach"));
    }

    @Override
    public List<Trainer> dislay() {
        return trainerList;
    }

    @Override
    public void addTrainer(Trainer trainer) {
        trainerList.add(trainer);
    }

    @Override
    public void deleteTrainer(int id) {
        for (int i = 0; i < trainerList.size(); i++) {
            if (id == trainerList.get(i).getId()){
                trainerList.remove(trainerList.get(i));
        }
    }
}
}
