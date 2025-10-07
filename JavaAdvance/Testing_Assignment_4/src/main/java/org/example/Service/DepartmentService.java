package org.example.Service;

import org.example.Entity.Department;
import org.example.Repository.DepartmentRepository;
import org.example.Repository.DepartmentRepositoryImp;

public class DepartmentService {
    private DepartmentRepository departmentRepository = new DepartmentRepositoryImp();

    //constructor
    public DepartmentService() {}
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public void createDepartment(Department department){
        departmentRepository.save(department);
    }
}
