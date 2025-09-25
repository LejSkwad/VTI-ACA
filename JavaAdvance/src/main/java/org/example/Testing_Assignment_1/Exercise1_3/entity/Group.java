package org.example.Testing_Assignment_1.Exercise1_3.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "`Group`")
public class Group {
    @Id
    @Column(name = "GroupID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int GroupID;

    @Column(name = "GroupName")
    private String GroupName;

    @Column(name = "CreateDate")
    private LocalDateTime CreateDate;

    public Group() {
    }

    // Constructor đầy đủ
    public Group(String name, LocalDateTime createDate) {
        this.GroupName = name;
        this.CreateDate = createDate;
    }

    // Getter & Setter
    public int getId() {
        return GroupID;
    }


    public String getName() {
        return GroupName;
    }

    public void setName(String name) {
        this.GroupName = name;
    }

    public LocalDateTime getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.CreateDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{id=" + GroupID + ", name='" + GroupName + "', createDate=" + CreateDate + "}";
    }
}
