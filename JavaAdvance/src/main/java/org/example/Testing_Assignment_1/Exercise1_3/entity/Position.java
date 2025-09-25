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
    @Enumerated(EnumType.STRING)
    private PositionEnum PositionName;

    public int getPositionID() {
        return PositionID;
    }

    public void setPositionID(int positionID) {
        PositionID = positionID;
    }

    public PositionEnum getPositionName() {
        return PositionName;
    }

    public void setPositionName(PositionEnum positionName) {
        PositionName = positionName;
    }
}
