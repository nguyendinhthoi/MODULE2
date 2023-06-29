package case_study.repository.person.employee;

import case_study.model.person.Employee;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class EmployeeRepository implements IEmployeeRepository {
    private final static String FILE_PATH_EMPLOYEE = "src/case_study/data/employee.csv";

    @Override
    public List<Employee> displayEmployee() {
        List<String> stringList = ReadAndWrite.readFile(FILE_PATH_EMPLOYEE);
        Collections.sort(stringList);
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        //String name, String dateOfBirth, boolean gender, String identity, int phoneNumber
        // , String email, String employeeCode, String level, String role, double salary
        for (String s : stringList) {
            info = s.split(",");
            Employee employee = new Employee(info[0], info[1], (info[2]), Boolean.parseBoolean(info[3]), info[4], info[5], info[6], info[7], info[8], info[9]);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> stringList1 = new ArrayList<>();
        stringList1.add(employee.getIntoCSV());
        ReadAndWrite.writeFile(FILE_PATH_EMPLOYEE, stringList1, true);
    }

    @Override
    public void editEmployee(String id, Employee employee) {
        List<String> stringList = ReadAndWrite.readFile(FILE_PATH_EMPLOYEE);
        stringList.set(searchIndex(id), employee.getIntoCSV());
        ReadAndWrite.writeFile(FILE_PATH_EMPLOYEE, stringList, false);
    }

    @Override
    public int searchIndex(String id) {
        List<Employee> employeeList = displayEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(id, employeeList.get(i).getEmployeeCode())) {
                return i;
            }
        }
        return -1;
    }

    public void showInfo(String id) {
        List<Employee> employeeList = displayEmployee();
        System.out.println(employeeList.get(searchIndex(id)));
    }
}
