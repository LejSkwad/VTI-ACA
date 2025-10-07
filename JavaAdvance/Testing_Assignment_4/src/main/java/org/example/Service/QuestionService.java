package org.example.Service;

import org.example.Entity.Question;
import org.example.Repository.QuestionRepositoryImp;

import java.util.List;

public class QuestionService {
    private QuestionRepositoryImp questionRepositoryImp;

    //constructor
    public QuestionService() {}
    public QuestionService(QuestionRepositoryImp questionRepositoryImp) {
        this.questionRepositoryImp = questionRepositoryImp;
    }

    public void create(Question question) {
        questionRepositoryImp.save(question);
    }

    public Question getQuestionByID(int questionID) {
        return questionRepositoryImp.getQuestionByID(questionID);
    }

    public List<Question> getQuestionHaving2Answer() {
        return questionRepositoryImp.getQuestionHaving2CorrectAns();
    }

}
