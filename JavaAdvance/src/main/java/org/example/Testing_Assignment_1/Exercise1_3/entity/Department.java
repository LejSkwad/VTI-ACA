package org.example.Testing_Assignment_1.Exercise1_3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @Column(name = "DepartmentID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DepartmentID;

    @Column(name = "DepartmentName")
    private String DepartmentName;
}
