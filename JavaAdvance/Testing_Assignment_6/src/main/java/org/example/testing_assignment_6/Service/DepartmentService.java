package org.example.testing_assignment_6.Service;

import org.example.testing_assignment_6.DTO.DepartmentFilter;
import org.example.testing_assignment_6.Entity.Department;
import org.example.testing_assignment_6.Filter.DepartmentSpecification;
import org.example.testing_assignment_6.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Page<Department> getDepartments(DepartmentFilter departmentFilter,int page, int size, String sortBy, String direction) {
        Sort sort ="desc".equalsIgnoreCase(direction) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(page, size, sort );
        return departmentRepository.findAll(DepartmentSpecification.byFilter(departmentFilter), pageable);
    }
}
