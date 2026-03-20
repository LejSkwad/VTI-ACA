package org.example.testing_assignment_6.Mapper.Response;

import org.example.testing_assignment_6.DTO.Response.DepartmentResponse;
import org.example.testing_assignment_6.Entity.Department;

public class DepartmentResponseMapper {
    public static DepartmentResponse map(Department department){
        DepartmentResponse departmentResponse = new DepartmentResponse();
        departmentResponse.setDepartmentId(department.getDepartmentId());
        departmentResponse.setDepartmentName(department.getDepartmentName());
        return departmentResponse;
    }
}
