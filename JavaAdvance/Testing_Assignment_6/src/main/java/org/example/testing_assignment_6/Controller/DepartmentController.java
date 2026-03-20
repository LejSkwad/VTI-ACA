package org.example.testing_assignment_6.Controller;

import org.example.testing_assignment_6.DTO.Filter.DepartmentFilter;
import org.example.testing_assignment_6.DTO.Response.DepartmentResponse;
import org.example.testing_assignment_6.Entity.Department;
import org.example.testing_assignment_6.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService ) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public Page<Department> getDepartments(Pageable pageable) {
        return departmentService.findAll(pageable);
    }

    @GetMapping("/filter")
    public ResponseEntity<?> getFilteredDepartments(DepartmentFilter departmentFilter){
        Page<Department> result = departmentService.filterDepartment(departmentFilter);
        return ResponseEntity.ok(result);
    }
}
