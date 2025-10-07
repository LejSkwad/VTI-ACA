package org.example.Repository;

import org.example.Entity.Question;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class QuestionRepositoryImp implements QuestionRepository {
    @Override
    public void save(Question question) {
        Transaction transaction;
        try(Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(question);
            session.save(question);
            transaction.commit();
        }
    }

    @Override
    public Question getQuestionByID(int questionID) {
        try(Session session = HibernateUtils.getSessionFactory().openSession()) {
            Question question = session.get(Question.class, questionID);
            return question;
        }
    }

    @Override
    public List<Question> getQuestionHaving2CorrectAns() {
        try(Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "SELECT q FROM Question q JOIN q.Answers a WHERE a.isCorrect = true GROUP BY q.QuestionID HAVING COUNT(a.question) > 2";
            List<Question> questions = session.createQuery(hql,Question.class).getResultList();
            return questions;
        }
    }
}
