package backend.businesslayer;

import entity.Manager;

import java.util.List;

public interface IManagerService {
    List<Manager> getAllManagers();

    boolean loginManager(String email, String password);
}
