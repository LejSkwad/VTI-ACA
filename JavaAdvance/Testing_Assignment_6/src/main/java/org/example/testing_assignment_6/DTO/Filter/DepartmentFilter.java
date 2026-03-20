package org.example.testing_assignment_6.DTO.Filter;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DepartmentFilter {
    private Integer id;
    private String name;
    private Integer minEmployeeCount;
    private Integer maxEmployeeCount;
}
