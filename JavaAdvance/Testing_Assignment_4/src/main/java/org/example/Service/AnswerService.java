package org.example.Service;

import org.example.Entity.Answer;
import org.example.Repository.AnswerRepository;

public class AnswerService {
    private AnswerRepository answerRepository;

    //constructor
    public AnswerService() {}
    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public void create(Answer answer){
        answerRepository.save(answer);
    }
}
