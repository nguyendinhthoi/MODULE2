package case_study.repository.person.customer;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_PATHFILE = "src/case_study/data/customer.csv";

    @Override
    public List<Customer> displayCust() {
        List<String> stringList = ReadAndWrite.readFile(CUSTOMER_PATHFILE);
        List<Customer> customerList = new ArrayList<>();
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
            customerList.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
        }
        return customerList;
    }

    @Override
    public void addCust(Customer customer) {
        List<String> stringList = ReadAndWrite.readFile(CUSTOMER_PATHFILE);
        stringList.add(customer.getInToCSV());
        ReadAndWrite.writeFile(CUSTOMER_PATHFILE, stringList, true);
    }

    @Override
    public void editCust(Customer customer, String id) {
        List<String> stringList = ReadAndWrite.readFile(CUSTOMER_PATHFILE);
        stringList.set(searchIndex(id), customer.getInToCSV());
        ReadAndWrite.writeFile(CUSTOMER_PATHFILE, stringList, false);
    }

    @Override
    public int searchIndex(String id) {
        List<Customer> customerList = displayCust();
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(id, customerList.get(i).getCustomerCode())) {
                return i;
            }
        }
        return -1;
    }
    public void showInfo(String id) {
        List<Customer> customerList = displayCust();
        System.out.println(customerList.get(searchIndex(id)));
    }
}
