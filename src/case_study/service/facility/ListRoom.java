package case_study.service.facility;

import case_study.common.regex.Regex1;
import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;

import static case_study.view.Run.scanner;

public class ListRoom {
    public static Facility addRoom() {
        //String serviceCode, String serviceName,
        // double usableArea, double rentalCost, int maxPeople, String rentalType, String freeService
        String id = Regex1.checkRoomCode();
        String name = Regex1.checkNameService();
        double area = Regex1.checkUsualArea();
        double cost = Regex1.checkRentCost();
        int people = Regex1.checkMaxPeople();
        String rentalType = Regex1.checkRentalType();
        String freeService = Regex1.checkFreeService();

        Facility facility = new Room(id, name, area, cost, people, rentalType, freeService);
        return facility;
    }
}
