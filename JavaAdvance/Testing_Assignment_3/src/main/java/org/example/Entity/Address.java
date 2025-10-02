package org.example.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AddressID")
    private int AddressID;

    @Column(name = "AddressName", nullable = false)
    private String AddressName;

    @OneToMany(mappedBy = "address",fetch = FetchType.LAZY)
    private List<DetailDepartment> departmentList = new ArrayList<>();

    public Address() {}

    public String getAddressName() {
        return AddressName;
    }

    public void setAddressName(String addressName) {
        AddressName = addressName;
    }

    public int getAddressID() {
        return AddressID;
    }

    public void setAddressID(int addressID) {
        AddressID = addressID;
    }
}
