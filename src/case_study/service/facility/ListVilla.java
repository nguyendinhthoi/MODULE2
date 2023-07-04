package case_study.service.facility;

import case_study.common.regex.Regex1;
import case_study.model.facility.Facility;
import case_study.model.facility.Villa;

import static case_study.view.Run.scanner;

public class ListVilla {
    public static Facility addVilla() {
        //String serviceCode, String serviceName, double usableArea,
        // double rentalCost, int maxPeople, String rentalType, String kindOfRoom, double poolArea, int numberOfFloor
        String id = Regex1.checkVillaCode();
        String name = Regex1.checkNameService();
        double area = Regex1.checkUsualArea();
        double cost = Regex1.checkRentCost();
        int people = Regex1.checkMaxPeople();
        String rentalType = Regex1.checkRentalType();
        String kindOfRoom = Regex1.checkKindOfRoom();
        double poolArea = Regex1.checkPoolArea();
        int floor = Regex1.checkNumberOfFloor();

        Facility facility = new Villa(id, name, area, cost, people, rentalType, kindOfRoom, poolArea, floor);
        return facility;
    }
}
