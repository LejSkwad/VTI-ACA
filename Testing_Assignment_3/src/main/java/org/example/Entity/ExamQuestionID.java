package org.example.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class ExamQuestionID {
    private int ExamID;
    private int QuestionID;

    public ExamQuestionID(){}
}
