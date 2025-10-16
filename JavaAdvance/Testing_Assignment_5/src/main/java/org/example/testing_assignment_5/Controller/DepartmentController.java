package org.example.testing_assignment_5.Controller;

import org.example.testing_assignment_5.Entity.Department;
import org.example.testing_assignment_5.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> findAll(){
        return departmentService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Department> findById(@PathVariable Integer id){
        return departmentService.findById(id);
    }

    @GetMapping(value = "/{name}")
    public Department findByName(@PathVariable String name){
        return departmentService.findByName(name);
    }

    @PostMapping
    public Department save(@RequestBody Department department){
        return departmentService.save(department);
    }
    @PutMapping(value = "/{id}")
    public Department update(@PathVariable Integer id, @RequestBody Department department){
        department.setDepartmentID(id);
        return departmentService.update(department);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Integer id){
        departmentService.deleteById(id);
    }
}
