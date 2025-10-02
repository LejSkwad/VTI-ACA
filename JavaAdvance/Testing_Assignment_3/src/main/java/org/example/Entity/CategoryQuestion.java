package org.example.Entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CategoryQuestion")
public class CategoryQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private int CategoryID;

    @Column(name = "CategoryName")
    private String CategoryName;

    @OneToMany(mappedBy = "categoryQuestion",cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public CategoryQuestion(int categoryID, String categoryName) {
        CategoryID = categoryID;
        CategoryName = categoryName;
    }
    public CategoryQuestion() {}
}
