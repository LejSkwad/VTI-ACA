package org.example.testing_assignment_6.Controller;

import org.example.testing_assignment_6.DTO.DepartmentFilter;
import org.example.testing_assignment_6.Entity.Department;
import org.example.testing_assignment_6.Repository.DepartmentRepository;
import org.example.testing_assignment_6.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService ) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public Page<Department> getDepartments(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "name") String sortBy,
            @RequestParam(defaultValue = "asc") String direction,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) int minEmployeeCount,
            @RequestParam(required = false) int maxEmployeeCount
    ){
        DepartmentFilter departmentFilter = new DepartmentFilter();
        departmentFilter.setName(name);
        departmentFilter.setMinEmployeeCount(minEmployeeCount);
        departmentFilter.setMaxEmployeeCount(maxEmployeeCount);

        return departmentService.getDepartments(departmentFilter,page,size,sortBy,direction);
    }
}
