package case_study.repository.facility;

import case_study.model.facility.Facility;
import case_study.repository.not_neccessary_yet.Repository;

import java.util.Map;

public interface IFacilityRepository extends Repository {
    Map<Facility, Integer> displayFacility(int choice);

    void addFacility(int choice, Facility facility);
    String searchIndexFacility(int choice, String id);
    void displayMaintance();
}
