package case_study.model.person;

import case_study.model.person.Person;

import static case_study.model.person.Employee.COMMAA;

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

    public Customer(String customerCode, String name, String dateOfBirth, String gender, String identity, String phoneNumber, String email, String kindOfCustomer, String address) {
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

    public String getInToCSV() {
        //return employeeCode + COMMAA + getName() + COMMAA + getDateOfBirth() + COMMAA + gender + COMMAA + getIdentity() + COMMAA + getPhoneNumber() + COMMAA + getEmail() + COMMAA + level + COMMAA + role + COMMAA + salary;
        return customerCode + COMMAA + getName() + COMMAA + getDateOfBirth() + COMMAA + gender + COMMAA + getIdentity() + COMMAA + getPhoneNumber() + COMMAA + getEmail() + COMMAA + kindOfCustomer + COMMAA + address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", identity='" + identity + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", kindOfCustomer='" + kindOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
