package org.example.Repository;

import org.example.Entity.Position;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PositionRepositoryImp implements PositionRepository {
    @Override
    public void save(Position position){
        Transaction transaction;
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(position);
            transaction.commit();
        }
    }
}
