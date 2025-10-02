package org.example.Exercise1_3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TypeQuestion")
public class TypeQuestion {
    @Id
    @Column(name = "TypeID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TypeID;

    @Column(name = "TypeName")
    private String TypeName;

    public int getTypeID() {
        return TypeID;
    }

    public void setTypeID(int typeID) {
        TypeID = typeID;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }
}
