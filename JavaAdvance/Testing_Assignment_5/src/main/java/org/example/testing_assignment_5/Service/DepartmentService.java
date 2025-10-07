package org.example.testing_assignment_5.Service;

import org.example.testing_assignment_5.Entity.Department;
import org.example.testing_assignment_5.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department findByName(String name){
        return departmentRepository.findByDepartmentName(name);
    }

    public Optional<Department> findById(int id){
        return departmentRepository.findById(id);
    }

    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

    public Department save(Department department){
        return departmentRepository.save(department);
    }

    public void deleteById(Integer id){
        departmentRepository.deleteById(id);
    }

    public Department update(Department department){
        return departmentRepository.save(department);
    }

}

