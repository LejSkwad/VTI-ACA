package backend.Repository;

import entity.Manager;

import java.util.List;

public interface IManagerRepository {
    List<Manager> findAll();

    boolean login(String email, String password);
}
