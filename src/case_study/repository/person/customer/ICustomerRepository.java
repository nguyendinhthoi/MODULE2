package case_study.repository.person.customer;

import case_study.model.person.Customer;
import case_study.repository.not_neccessary_yet.Repository;
import case_study.repository.person.similar_method.SimilarMethod;

import java.util.List;

public interface ICustomerRepository extends Repository, SimilarMethod {
    List<Customer> displayCust();

    void addCust(Customer customer);

    void editCust(Customer customer, String id);

    void showInfo(String id);

}
