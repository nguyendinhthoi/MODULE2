package case_study.model.person;

import case_study.model.person.Person;

public class Customer extends Person {
    private String customerCode;
    private String kindOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String customerCode, String kindOfCustomer, String address) {
        this.customerCode = customerCode;
        this.kindOfCustomer = kindOfCustomer;
        this.address = address;
    }

    public Customer(String name, String dateOfBirth, boolean gender, String identity, String phoneNumber, String email, String customerCode, String kindOfCustomer, String address) {
        super(name, dateOfBirth, gender, identity, phoneNumber, email);
        this.customerCode = customerCode;
        this.kindOfCustomer = kindOfCustomer;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getKindOfCustomer() {
        return kindOfCustomer;
    }

    public void setKindOfCustomer(String kindOfCustomer) {
        this.kindOfCustomer = kindOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", kindOfCustomer='" + kindOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", identity='" + identity + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
