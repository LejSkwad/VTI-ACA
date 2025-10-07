package org.example.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JoinColumnOrFormula;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @Column(name = "AccountID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AccountID;

    @Column(name = "Email")
    private String Email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Department",nullable = false)
    private Department Department;

    @ManyToOne
    @JoinColumn(name = "Position",nullable = false)
    private Position Position;

    public Account(){}
    public Account(int AccountID, Department Department, Position Position){
        this.AccountID = AccountID;
        this.Department = Department;
        this.Position = Position;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public Department getDepartment() {
        return Department;
    }

    public void setDepartment(Department department) {
        Department = department;
    }

    public Position getPosition() {
        return Position;
    }

    public void setPosition(Position position) {
        Position = position;
    }
}
