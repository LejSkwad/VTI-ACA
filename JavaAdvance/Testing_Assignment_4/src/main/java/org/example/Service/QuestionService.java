package org.example.Service;

import org.example.Entity.Question;
import org.example.Repository.QuestionRepository;

import java.util.List;

public class QuestionService {
    private QuestionRepository questionRepository;

    //constructor
    public QuestionService() {}
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void create(Question question) {
        questionRepository.save(question);
    }

    public Question getQuestionByID(int questionID) {
        return questionRepository.getQuestionByID(questionID);
    }

    public List<Question> getQuestionHaving2Answer() {
        return questionRepository.getQuestionHaving2CorrectAns();
    }

}
