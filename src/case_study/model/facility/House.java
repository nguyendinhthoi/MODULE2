package case_study.model.facility;

public class House extends Facility {
    private String kindOfRoom;
    private int numberOfFloor;

    public House() {
    }

    public House(String kindOfRoom, int numberOfFloor) {
        this.kindOfRoom = kindOfRoom;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType, String kindOfRoom, int numberOfFloor) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.kindOfRoom = kindOfRoom;
        this.numberOfFloor = numberOfFloor;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                " serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxPeople=" + maxPeople +
                ", rentalType=" + rentalType +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
