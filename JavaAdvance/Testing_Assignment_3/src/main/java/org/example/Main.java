package org.example;

import org.example.Entity.Group;
import org.example.Repository.DepartmentRepositoryImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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