package backend.Controller;

import backend.businesslayer.ManagerService;
import entity.Manager;
import frontend.ManagerFrontend;

import java.util.List;

public class ManagerController {
    private final ManagerService service;
    private ManagerFrontend frontend;

    public ManagerController(ManagerService service, ManagerFrontend frontend) {
        this.service = service;
        this.frontend = frontend;
    }

    public List<Manager> getAllManagers() {
        return service.getAllManagers();
    }

    public void login() {
        String email = frontend.inputEmail();
        String password = frontend.inputPassword();

        boolean success = service.loginManager(email, password);

        if (success) {
            System.out.println("Đăng nhập thành công!");
        } else {
            System.out.println("Sai Email hoặc Password, hoặc bạn không phải Manager.");
        }
    }
}
