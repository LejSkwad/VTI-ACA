package org.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Answer")
public class Answer {
    @Id
    @Column(name = "AnswerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AnswerID;

    @Column(name = "Content", nullable = false, length = 100)
    private String Content;

    @Column(name = "isCorrect")
    private boolean isCorrect;

    @ManyToOne
    @JoinColumn(name = "QuestionID",nullable = false)
    private Question question;

    public Answer() {}

    public Answer(int AnswerID, String Content, Question Question) {
        this.AnswerID = AnswerID;
        this.Content = Content;
        this.question = Question;
    }

    public int getAnswerID() {
        return AnswerID;
    }

    public void setAnswerID(int answerID) {
        AnswerID = answerID;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
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
