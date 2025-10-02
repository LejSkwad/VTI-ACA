package org.example.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "ExamQuestion")
public class ExamQuestion{
    @EmbeddedId
    private ExamQuestionID examQuestionID;

    @ManyToOne
    @JoinColumn(name = "ExamID",nullable = false)
    private Exam exam;

    @ManyToOne
    @JoinColumn(name = "QuestionID",nullable = false)
    private Question question;

    public ExamQuestion(){}

    public ExamQuestionID getExamQuestionID() {
        return examQuestionID;
    }

    public void setExamQuestionID(ExamQuestionID examQuestionID) {
        this.examQuestionID = examQuestionID;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
