package org.example.Repository;

import org.example.Entity.Question;

import java.util.List;

public interface IQuestionRepository {
    public void save(Question question);
    public Question getQuestionByID(int questionID);
    public List<Question> getQuestionHaving2CorrectAns();
}
