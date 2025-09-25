package org.example.Testing_Assignment_1.Exercise1_3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "`Salary`")
public class Salary {
    @Id
    @Column(name = "SalaryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SalaryID;

    @Column(name = "SalaryName")
    private String SalaryName;

    public int getSalaryID() {
        return SalaryID;
    }

    public void setSalaryID(int salaryID) {
        SalaryID = salaryID;
    }

    public String getSalaryName() {
        return SalaryName;
    }

    public void setSalaryName(String salaryName) {
        SalaryName = salaryName;
    }
}
