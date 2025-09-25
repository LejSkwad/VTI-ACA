package org.example;

import org.example.Testing_Assignment_1.Repository.DepartmentRepositoryImpl;
import org.example.Testing_Assignment_1.entity.Department;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Exercise1
        DepartmentRepositoryImpl departmentRepo = new DepartmentRepositoryImpl();
        departmentRepo.CreateGroup("haha");
        departmentRepo.DeleteGroup(1);
    }
}