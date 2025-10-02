package org.example.Exercise1_3;

import org.example.Exercise1_3.Repository.DepartmentRepositoryImpl;
import org.example.Exercise1_3.entity.Group;

public class Main {
    public static void main(String[] args) {

        //Exercise1
        DepartmentRepositoryImpl departmentRepo = new DepartmentRepositoryImpl();
        //departmentRepo.CreateGroup("haha");
        //departmentRepo.DeleteGroup(1);
        Group group = departmentRepo.getGroupByID(1);
        if (group == null) {
            System.out.println("Group not found");
        } else {
            System.out.println(group.toString());
        }

    }
}
