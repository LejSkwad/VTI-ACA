package org.example.Repository;

import org.example.Entity.Group;

public interface DepartmentRepository {
    void CreateGroup(String name);
    void DeleteGroup(int id);
    Group getGroupByID(int id);
}
