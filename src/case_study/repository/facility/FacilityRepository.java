package case_study.repository.facility;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.utils.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import static case_study.view.Run.scanner;

public class FacilityRepository implements IFacilityRepository {
    static Map<Facility, Integer> houseIntegerMap = new LinkedHashMap<>();
    static Map<Facility, Integer> villaIntegerMap = new LinkedHashMap<>();
    static Map<Facility, Integer> roomIntegerMap = new LinkedHashMap<>();

    //String serviceCode, String serviceName, double usableArea
    // , double rentalCost, int maxPeople, int rentalType, String kindOfRoom, double poolArea, int numberOfFloor
    static {
        houseIntegerMap.put(new House("SVHO-0001", "Swimming Pool", 100000, 500000, 5, "week", "Vip", 3), 0);
        houseIntegerMap.put(new House("SVHO-0002", "Double Room", 200000, 1000000, 6, "week", "Vip", 3), 0);
        villaIntegerMap.put(new Villa("SVVL-0001", "Family Villa", 200000, 1000000, 10, "week", "Standard", 200, 3), 0);
        villaIntegerMap.put(new Villa("SVVL-0002", "Family Villa", 100000, 1000000, 8, "week", "Standard", 100, 3), 0);
        roomIntegerMap.put(new Room("SVRO-0001", "Family Room", 5000, 10000, 3, "day", "Common"), 0);
        roomIntegerMap.put(new Room("SVRO-0002", "Family Room", 7000, 15000, 4, "day", "Common"), 0);
    }

    public Map<Facility, Integer> displayFacility(int choice) {
        switch (choice) {
            case 1:
                return houseIntegerMap;
            case 2:
                return villaIntegerMap;
            case 3:
                return roomIntegerMap;
            default:
                return null;
        }
    }

    @Override
    public void addFacility(int choice, Facility facility) {
        switch (choice) {
            case 1:
                houseIntegerMap.put(facility, 0);
            case 2:
                villaIntegerMap.put(facility, 0);
            case 3:
                roomIntegerMap.put(facility, 0);
        }
    }

    @Override
    public void displayMaintance() {

    }

    public String searchIndexFacility(int choice, String id) {
        switch (choice) {
            case 1:
                Map<Facility, Integer> houseIntegerMap = displayFacility(choice);
                for (Map.Entry<Facility, Integer> s : houseIntegerMap.entrySet()) {
                    if (Objects.equals(s.getKey().getServiceCode(), id)) {
                        return "true";
                    } else {
                        return "-1";
                    }
                }
            case 2:
                Map<Facility, Integer> villaIntegerMap = displayFacility(choice);
                for (Map.Entry<Facility, Integer> s : villaIntegerMap.entrySet()) {
                    if (Objects.equals(s.getKey().getServiceCode(), id)) {
                        return "true";
                    } else {
                        return "-1";
                    }
                }
            case 3:
                Map<Facility, Integer> roomIntegerMap = displayFacility(choice);
                for (Map.Entry<Facility, Integer> s : roomIntegerMap.entrySet()) {
                    if (Objects.equals(s.getKey().getServiceCode(), id)) {
                        return "true";
                    } else {
                        return "-1";
                    }
                }
            default:
                return "Try again!!";
        }
    }
}

