package case_study.service.person.customer;

import case_study.common.exception.ConfirmFormat;
import case_study.common.exception.IDAvailable;
import case_study.common.exception.IDNotFound;
import case_study.common.regex.Regex1;
import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.person.customer.CustomerRepository;
import case_study.repository.person.customer.ICustomerRepository;
import case_study.service.person.customer.ICustomerService;

import java.util.List;
import java.util.Objects;

import static case_study.view.Run.scanner;

public class CustomerService implements ICustomerService {

    ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void displayCust() {
        List<Customer> customerList = customerRepository.displayCust();
        for (Customer s : customerList) {
            System.out.println(s);
        }
    }

    @Override
    public void addCust() {
        do {
            try {
                String customerCode = Regex1.checkIDOfCust();
                if (customerRepository.searchIndex(customerCode) == -1) {
                    String name = Regex1.checkName();
                    String date = Regex1.checkDate();
                    String gender = Regex1.checkGender();
                    String identity = Regex1.checkIdentity();
                    String phoneNumber = Regex1.checkPhone();
                    String email = Regex1.checkEmail();
                    String kindOfCustomer = Regex1.checkKindOfCust();
                    System.out.print("Enter address : ");
                    String address = scanner.nextLine();

//    public Customer(String name, String dateOfBirth, String gender, String identity, String phoneNumber, String email, String customerCode, String kindOfCustomer, String address) {

                    Customer customer = new Customer(customerCode, name, date, gender, identity, phoneNumber, email, kindOfCustomer, address);
                    customerRepository.addCust(customer);
                    break;
                } else {
                    displayCust();
                    throw new IDAvailable();
                }
            } catch (IDAvailable e) {
                System.out.println("ID Already Available!! Please Try Again!!");
            }
        } while (true);
    }

    @Override
    public void editCust() {
        do {
            try {
                String customerCode  = Regex1.checkIDOfCust();
                if (customerRepository.searchIndex(customerCode) == -1) {
                    throw new IDNotFound();
                } else {
                    customerRepository.showInfo(customerCode);
                    System.out.print("Do you want to edit this employee? (yes/no) ");
                    String confirm = scanner.nextLine();

                    if (Objects.equals(confirm, "yes")) {
                        String name = Regex1.checkName();
                        String date = Regex1.checkDate();
                        String gender = Regex1.checkGender();
                        String identity = Regex1.checkIdentity();
                        String phoneNumber = Regex1.checkPhone();
                        String email = Regex1.checkEmail();
                        String kindOfCustomer = Regex1.checkKindOfCust();
                        System.out.print("Enter address : ");
                        String address = scanner.nextLine();

                        Customer customer = new Customer(customerCode, name, date, gender, identity, phoneNumber, email, kindOfCustomer, address);
                        customerRepository.addCust(customer);
                        break;
                    } else if (Objects.equals(confirm, "no")) {
                        System.out.println("Choose another Function!!!");
                        break;
                    } else {
                        throw new ConfirmFormat();
                    }
                }
            } catch (IDNotFound e) {
                System.out.println("ID Not Found");
            } catch (ConfirmFormat e) {
                System.out.println("Please Just Enter yes or no!!! Try Again!!!");
            }
        } while (true);
    }
}




