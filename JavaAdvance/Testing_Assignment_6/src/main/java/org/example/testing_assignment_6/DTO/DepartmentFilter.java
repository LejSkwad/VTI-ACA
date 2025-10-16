package org.example.testing_assignment_6.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DepartmentFilter {
    private Integer id;
    private String name;
    private Integer minEmployeeCount;
    private Integer maxEmployeeCount;

    public DepartmentFilter() {}
    public DepartmentFilter(Integer id, String name, Integer minEmployeeCount, Integer maxEmployeeCount) {
        this.id = id;
        this.name = name;
        this.minEmployeeCount = minEmployeeCount;
        this.maxEmployeeCount = maxEmployeeCount;
    }
}
