package org.example.Repository;

import org.example.Entity.Department;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentRepositoryImp implements DepartmentRepository {
    @Override
    public void save(Department department) {
        Transaction transaction;
        try(Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(department);
            transaction.commit();
        }
    }
}
