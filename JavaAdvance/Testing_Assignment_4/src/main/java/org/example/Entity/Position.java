package org.example.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Position")
public class Position {
    @Id
    @Column(name = "PositionID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PositionID;


    @Column(name = "PositionName")
    private String PositionName;

    @OneToMany(mappedBy = "Position",cascade = CascadeType.ALL)
    private List<Account> Accounts = new ArrayList<>();

    @Column(name = "Salary")
    private double salary;

    public Position() {}
    public Position(int PositionID, String PositionName, double salary) {
        this.PositionID = PositionID;
        this.PositionName = PositionName;
        this.salary = salary;
    }

    public int getPositionID() {
        return PositionID;
    }

    public void setPositionID(int positionID) {
        PositionID = positionID;
    }

    public String getPositionName() {
        return PositionName;
    }

    public void setPositionName(String positionName) {
        PositionName = positionName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Account> getAccounts() {
        return Accounts;
    }

    public void setAccounts(List<Account> accounts) {
        Accounts = accounts;
    }
}
