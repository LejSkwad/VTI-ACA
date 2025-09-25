package org.example.Testing_Assignment_1.Exercise1_3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "`Position`")
public class Position {
    @Id
    @Column(name = "PositionID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PositionID;

    @Column(name = "PositionName")
    private String PositionName;

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
}
