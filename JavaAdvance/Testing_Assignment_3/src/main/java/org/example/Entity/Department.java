package org.example.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentID")
    private Long DepartmentID;

    @Column(name = "DepartmentName", nullable = false)
    private String DepartmentName;

    @OneToOne(mappedBy = "department")
    private DetailDepartment detailDepartment;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Account> accountList = new ArrayList<>();

    public Long getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(Long departmentID) {
        DepartmentID = departmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
}
