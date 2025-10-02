package org.example.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TypeQuestion")
public class TypeQuestion {
    @Id
    @Column(name = "TypeID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TypeID;

    @Column(name = "TypeName",nullable = false,unique = true)
    private String TypeName;

    @OneToMany(mappedBy = "typeQuestion", cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();

    public TypeQuestion() {}

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
