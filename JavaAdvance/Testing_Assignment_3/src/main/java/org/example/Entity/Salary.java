package org.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "`Salary`")
public class Salary {
    @Id
    @Column(name = "SalaryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SalaryID;

    @Column(name = "SalaryName")
    @Enumerated(EnumType.ORDINAL)
    private SalaryEnum SalaryName;
}
