package case_study.repository.person.employee;

import case_study.model.person.Employee;
import case_study.repository.not_neccessary_yet.Repository;
import case_study.repository.person.similar_method.SimilarMethod;

import java.util.List;

public interface IEmployeeRepository extends Repository, SimilarMethod {
    List<Employee> displayEmployee();

    void addEmployee(Employee employee);

    void editEmployee(String id, Employee employee);

    int searchIndex(String id);

    void showInfo(String id);
}
