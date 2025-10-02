package org.example.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Answer")
public class Answer {
    @Id
    @Column(name = "Answers")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AnswerID;

    @Column(name = "Content", nullable = false)
    private String Content;

    @ManyToOne
    @JoinColumn(name = "QuestionID",nullable = false)
    private Question question;

    @Column(name = "isCorrect")
    private boolean isCorrect;

    public Answer() {}
}
