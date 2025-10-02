package org.example.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "DetailDepartment")
public class DetailDepartment {
    @Id
    @Column(name = "DepartmentID")
    private int DepartmentID;

    @Column(name = "AddressID")
    private int AddressID;

    @Column(name = "EmulationPoint")
    private int EmulationPoint;

    @OneToOne
    @MapsId
    @JoinColumn(name = "DepartmentID")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "AddressID")
    private Address address;

}
