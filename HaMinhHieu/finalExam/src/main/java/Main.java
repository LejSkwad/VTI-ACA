import backend.Controller.ManagerController;
import backend.Repository.EmployeeRepository;
import backend.Repository.ManagerRepository;
import backend.businesslayer.EmployeeService;

import backend.businesslayer.ManagerService;
import entity.Employee;
import entity.Manager;
import frontend.EmployeeFrontend;
import frontend.ManagerFrontend;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    //QUESTION 2
        EmployeeRepository employeeRepo = new EmployeeRepository();
        EmployeeService employeeService = new EmployeeService(employeeRepo);
        EmployeeFrontend employeeFrontend = new EmployeeFrontend();

        // lấy input từ frontend
        int projectId = employeeFrontend.inputProjectId();

        // xử lý qua service
        List<Employee> employees = employeeService.getEmployeeByProject(projectId);

        // in ra kết quả
        System.out.println("Employees of project " + projectId + ":");
        if (employees == null || employees.isEmpty()) {
            System.out.println("(No data)");
        } else {
            for (Employee e : employees) {
                System.out.println("ID: " + e.getId()
                        + ", Name: " + e.getFullname()
                        + ", Email: " + e.getEmail()
                        + ", ProSkill: " + e.getProskill()
                        + ", ProjectId: " + e.getProject_id());
            }
        }

    //QUESTION 3
        ManagerRepository managerRepo = new ManagerRepository();
        ManagerService managerService = new ManagerService(managerRepo);
        ManagerFrontend managerfrontend = new ManagerFrontend();
        ManagerController managerController = new ManagerController(managerService, managerfrontend);

        // lấy dữ liệu
        List<Manager> managers = managerController.getAllManagers();

        // in ra
        System.out.println("Danh sách Managers:");
        if (managers.isEmpty()) {
            System.out.println("(No data)");
        } else {
            for (Manager m : managers) {
                System.out.println("ID: " + m.getId()
                        + ", Name: " + m.getFullname()
                        + ", Email: " + m.getEmail()
                        + ", ExpInYear: " + m.getExperience()
                        + ", ProjectId: " + m.getProject_id());
            }
        }

    //QUESTION 4
        managerController.login();
    }
}
