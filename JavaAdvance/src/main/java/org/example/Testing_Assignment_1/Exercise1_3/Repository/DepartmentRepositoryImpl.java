package org.example.Testing_Assignment_1.Exercise1_3.Repository;

import org.example.Testing_Assignment_1.Exercise1_3.entity.Group;
import org.example.Testing_Assignment_1.Exercise1_3.utils.HibernateUtils;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDateTime;

public class DepartmentRepositoryImpl implements DepartmentRepository {
    @Override
    public void CreateGroup(String name) {
            Session session;
            Transaction transaction = null;
            try{
                session = HibernateUtils.getSessionFactory().openSession();
                transaction = session.beginTransaction();

                Group group = new Group();
                group.setName(name);
                group.setCreateDate(LocalDateTime.now());

                session.persist(group);
                transaction.commit();

            } catch(Exception e){
                if(transaction != null){ transaction.rollback();}
                e.printStackTrace();
            }

    }

    @Override
    public void DeleteGroup(int id) {
        Session session;
        Transaction transaction = null;
        try{
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Group group = session.get(Group.class, id);
            if(group != null){
                session.delete(group);
                transaction.commit();
            }
        } catch(Exception e){
            if(transaction != null){ transaction.rollback();}
        }


    }

    @Override
    public Group getGroupByID(int id){
        Session session;
        try{
            session = HibernateUtils.getSessionFactory().openSession();

            Group group = session.get(Group.class, id);

            return group;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
