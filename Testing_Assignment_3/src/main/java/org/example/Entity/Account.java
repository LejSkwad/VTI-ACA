package org.example.Entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "`Account`")
public class Account {
    @Id
    @Column(name = "AccountID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AccountID;

    @Column(name = "Email", nullable = false, unique = true)
    private String Email;

    @Column(name = "Username",nullable = false,unique = true)
    private String Username;

    @Column(name = "FirstName",nullable = false)
    private String FirstName;

    @Column(name = "LastName",nullable = false)
    private String LastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DepartmentID",nullable = false)
    private Department department;

    @OneToOne(mappedBy = "account")
    private Employee employee;

    @OneToOne(mappedBy = "account")
    private Manager manager;

    @OneToMany(mappedBy = "creator",fetch = FetchType.LAZY)
    private List<Group> groups = new ArrayList<>();

    @OneToMany(mappedBy = "creator",fetch = FetchType.LAZY)
    private List<Question> questions = new ArrayList<>();

    @OneToMany(mappedBy = "creator",fetch = FetchType.LAZY)
    private List<Exam> exams = new ArrayList<>();

    public Account() {}

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
