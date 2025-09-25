package org.example.Testing_Assignment_1;

import org.example.Testing_Assignment_1.Repository.DepartmentRepositoryImpl;

public class Main {
    public static void main(String[] args) {

        //Exercise1
        DepartmentRepositoryImpl departmentRepo = new DepartmentRepositoryImpl();
        departmentRepo.CreateGroup("haha");
        departmentRepo.DeleteGroup(1);
    }
}
