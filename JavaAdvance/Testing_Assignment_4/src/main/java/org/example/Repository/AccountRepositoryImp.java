package org.example.Repository;

import org.example.Entity.Account;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountRepositoryImp implements AccountRepository {
    public void save(Session session,Account account) {
        session.persist(account);
    }
}
