package org.example.Controller;

import org.example.Entity.Department;
import org.example.Repository.DepartmentRepository;
import org.example.Repository.DepartmentRepositoryImp;
import org.example.Service.DepartmentService;

import java.util.Scanner;

public class CreateDepartmentController {
    public static void main(String[] args) {
        DepartmentRepository departmentRepository = new DepartmentRepositoryImp();
        DepartmentService departmentService = new DepartmentService(departmentRepository);

        Scanner scanner = new Scanner(System.in);
        Department department = new Department();
        System.out.print("Enter Department Name: ");
        department.setDepartmentName(scanner.nextLine());
        departmentRepository.save(department);
    }
}
