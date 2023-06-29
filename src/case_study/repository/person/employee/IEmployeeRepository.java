package case_study.repository.person.employee;

import case_study.model.person.Employee;
import case_study.repository.not_neccessary_yet.Repository;

import java.util.List;

public interface IEmployeeRepository extends Repository {
    List<Employee> displayEmployee();

    void addEmployee(Employee employee);

    void editEmployee(String id, Employee employee);

    int searchIndex(String id);

    public void showInfo(String id);
}
