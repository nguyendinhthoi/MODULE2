package case_study.service.facility;

import case_study.common.regex.Regex1;
import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.repository.facility.FacilityRepository;
import case_study.repository.facility.IFacilityRepository;

import static case_study.view.Run.scanner;

public class ListHouse {
    IFacilityRepository iFacilityRepository = new FacilityRepository();

    public static Facility addHouse() {
        //String serviceCode, String serviceName
        // , double usableArea, double rentalCost, int maxPeople, String rentalType, String kindOfRoom, int numberOfFloor
        String id = Regex1.checkHouseCode();
        String name = Regex1.checkNameService();
        double area = Regex1.checkUsualArea();
        double cost = Regex1.checkRentCost();
        int people = Regex1.checkMaxPeople();
        String rentalType = Regex1.checkRentalType();
        String kindOfRoom = Regex1.checkKindOfRoom();
        int floor = Regex1.checkNumberOfFloor();

        Facility facility = new House(id, name, area, cost, people, rentalType, kindOfRoom, floor);
        return facility;

    }
}
