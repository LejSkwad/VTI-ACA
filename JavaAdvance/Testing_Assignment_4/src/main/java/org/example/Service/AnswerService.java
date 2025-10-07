package org.example.Service;

import org.example.Entity.Answer;
import org.example.Repository.AnswerRepositoryImp;

public class AnswerService {
    private AnswerRepositoryImp answerRepositoryImp;

    //constructor
    public AnswerService() {}
    public AnswerService(AnswerRepositoryImp answerRepositoryImp) {
        this.answerRepositoryImp = answerRepositoryImp;
    }

    public void create(Answer answer){
        answerRepositoryImp.save(answer);
    }
}
