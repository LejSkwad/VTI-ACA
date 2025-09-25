package org.example.Testing_Assignment_1.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "`Accoun`")
public class Account {
    @Id
    @Column(name = "AccountID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Username")
    private String username;

    @Column(name = "Firstname")
    private String firstname;

    @Column(name = "Lastname")
    private String lastname;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
