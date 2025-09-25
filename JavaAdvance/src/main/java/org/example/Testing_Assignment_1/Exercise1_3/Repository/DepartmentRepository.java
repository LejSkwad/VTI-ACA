package org.example.Testing_Assignment_1.Exercise1_3.Repository;

import org.example.Testing_Assignment_1.Exercise1_3.entity.Group;

public interface DepartmentRepository {
    void CreateGroup(String name);
    void DeleteGroup(int id);
    Group getGroupByID(int id);
}
