package backend.Controller;

import backend.businesslayer.EmployeeService;
import backend.businesslayer.IEmployeeService;
import entity.Employee;
import frontend.EmployeeFrontend;

import java.util.List;

public class EmployeeController {
    private final EmployeeService service;
    private final EmployeeFrontend frontend;

    public EmployeeController(EmployeeService service, EmployeeFrontend frontend) {
        this.service = service;
        this.frontend = frontend;
    }

    public List<Employee> getEmployeesByProject() {
        // gọi frontend để nhập projectId
        int projectId = frontend.inputProjectId();

        // gọi service để lấy dữ liệu
        return service.getEmployeeByProject(projectId);
    }

}
