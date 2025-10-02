package org.example.Exercise1_3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Question")
public class Question {
    @Id
    @Column(name = "QuestionID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int QuestionID;

    @Column(name = "Content")
    private String Content;

    @Column(name = "CreateDate")
    private String CreateDate;

    public int getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(int questionID) {
        QuestionID = questionID;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
