package backend.businesslayer;

import backend.Repository.EmployeeRepository;
import entity.Employee;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> getEmployeeByProject(int project_id) {
        if(project_id<=0) throw new  IllegalArgumentException("projectid phai > 0");
        return employeeRepository.findEmployeeByProjectId(project_id);
    }
}
