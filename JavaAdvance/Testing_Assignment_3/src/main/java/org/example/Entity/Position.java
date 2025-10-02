package org.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "`Position`")
public class Position {
    @Id
    @Column(name = "PositionID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PositionID;

    @Enumerated(EnumType.STRING)
    @Column(name = "PositionName", nullable = false, unique = true)
    private PositionEnum PositionName;

    public PositionEnum getPositionName() {
        return PositionName;
    }

    public void setPositionName(PositionEnum positionName) {
        PositionName = positionName;
    }

    public int getPositionID() {
        return PositionID;
    }

    public void setPositionID(int positionID) {
        PositionID = positionID;
    }
}
