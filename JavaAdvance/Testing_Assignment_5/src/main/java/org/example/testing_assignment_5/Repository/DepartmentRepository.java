package org.example.testing_assignment_5.Repository;

import org.example.testing_assignment_5.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    Department findByDepartmentName(String name);
    Department findByDepartmentID(int id);
}
