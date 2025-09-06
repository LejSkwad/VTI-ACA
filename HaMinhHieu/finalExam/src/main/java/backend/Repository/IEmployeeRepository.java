package backend.Repository;

import entity.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findEmployeeByProjectId(int project_id);
}
