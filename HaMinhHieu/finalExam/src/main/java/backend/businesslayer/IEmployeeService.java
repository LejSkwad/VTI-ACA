package backend.businesslayer;

import entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployeeByProject(int project_id);
}
