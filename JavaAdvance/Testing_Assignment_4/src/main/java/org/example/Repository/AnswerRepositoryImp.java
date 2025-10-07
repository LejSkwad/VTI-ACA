package org.example.Repository;

import org.example.Entity.Answer;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AnswerRepositoryImp implements AnswerRepository {
    @Override
    public void save(Answer answer) {
        Transaction transaction = null;
        try(Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(answer);
            session.save(answer);
            transaction.commit();
        }
    }
}
