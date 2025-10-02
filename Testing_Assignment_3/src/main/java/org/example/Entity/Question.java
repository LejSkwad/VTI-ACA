package org.example.Entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Question")
public class Question {
    @Id
    @Column(name = "QuestionID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int QuestionID;

    @Column(name = "Content",nullable = false)
    private String Content;

    @ManyToOne
    @JoinColumn(name = "CategoryID",nullable = false)
    private CategoryQuestion categoryQuestion;

    @ManyToOne
    @JoinColumn(name = "TypeID",nullable = false)
    private TypeQuestion typeQuestion;

    @ManyToOne
    @JoinColumn(name = "CreatorID",nullable = false)
    private Account creator;

    @Column(name = "CreateDate")
    private LocalDateTime CreateDate;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers = new ArrayList<>();

    @OneToMany(mappedBy = "question")
    private List<ExamQuestion> examQuestionList = new ArrayList<>();

    public Question() {}

    public int getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(int questionID) {
        QuestionID = questionID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public TypeQuestion getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(TypeQuestion typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public CategoryQuestion getCategoryQuestion() {
        return categoryQuestion;
    }

    public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
        this.categoryQuestion = categoryQuestion;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        CreateDate = createDate;
    }
}
