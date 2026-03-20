package org.example.testing_assignment_6.Service;

import org.example.testing_assignment_6.DTO.Filter.DepartmentFilter;
import org.example.testing_assignment_6.DTO.Response.DepartmentResponse;
import org.example.testing_assignment_6.Entity.Department;
import org.example.testing_assignment_6.Specification.DepartmentSpecification;
import org.example.testing_assignment_6.Mapper.Response.DepartmentResponseMapper;
import org.example.testing_assignment_6.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Page<Department> findAll(Pageable pageable) {
        return departmentRepository.findAll(pageable);
    }

    public Page<Department> findAll(Pageable pageable) {
        
        return departmentRepository.findAll(specification, pageable);
    }
}
