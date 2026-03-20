package org.example.testing_assignment_6.Specification;

import jakarta.persistence.criteria.*;
import org.example.testing_assignment_6.DTO.Filter.DepartmentFilter;
import org.example.testing_assignment_6.Entity.Department;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DepartmentSpecification {

    public static Specification<Department> byFilter(DepartmentFilter departmentFilter) {
        return (Root<Department> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (departmentFilter == null) return cb.and(predicates.toArray(new Predicate[0]));

            //lọc theo MaxEmployee
            if(departmentFilter.getMaxEmployeeCount() != null){
                predicates.add(cb.equal(root.get("maxEmployeeCount"), departmentFilter.getMaxEmployeeCount()));
            }

            //lọc theo MinEmployee
            if(departmentFilter.getMinEmployeeCount() != null){
                predicates.add(cb.equal(root.get("minEmployeeCount"), departmentFilter.getMinEmployeeCount()));
            }

            //lọc theo Name
            if (StringUtils.hasText(departmentFilter.getName())) {
                predicates.add(cb.like(cb.lower(root.get("name")), "%" + departmentFilter.getName().toLowerCase() + "%"));
            }

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}

