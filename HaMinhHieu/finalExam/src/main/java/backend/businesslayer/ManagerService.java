package backend.businesslayer;

import backend.Repository.ManagerRepository;
import entity.Manager;

import java.util.List;

public class ManagerService implements IManagerService {
    private final ManagerRepository repo;


    public ManagerService(ManagerRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Manager> getAllManagers() {
        return repo.findAll();
    }

    @Override
    public boolean loginManager(String email, String password) {
        return repo.login(email, password);
    }
}
