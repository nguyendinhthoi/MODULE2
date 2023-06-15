package bai_tap_them_1.repository;

import bai_tap_them_1.model.Trainer;

import java.util.List;

public interface ITrainerRepository {
    List<Trainer> dislay();
    void addTrainer();
    void deleteTrainer();
}
