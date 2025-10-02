package org.example.Exercise1_3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Answer")
public class Answer {
    @Id
    @Column(name = "AnswerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AnswerID;

    @Column(name = "Content")
    private String Content;

    @Column(name = "isCorrect")
    private boolean isCorrect;

    public int getAnswerID() {
        return AnswerID;
    }

    public void setAnswerID(int answerID) {
        AnswerID = answerID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
