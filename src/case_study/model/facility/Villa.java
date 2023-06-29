package case_study.model.facility;

import case_study.model.facility.Facility;

public class Villa extends Facility {
    private String kindOfRoom;
    private double poolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public Villa(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, int rentalType, String kindOfRoom) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.kindOfRoom = kindOfRoom;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "kindOfRoom='" + kindOfRoom + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                ", serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxPeople=" + maxPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
