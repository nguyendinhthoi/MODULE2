package case_study.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                " serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxPeople=" + maxPeople +
                ", rentalType=" + rentalType +
                ", freeService='" + freeService + '\'' +
                '}';
    }
}
