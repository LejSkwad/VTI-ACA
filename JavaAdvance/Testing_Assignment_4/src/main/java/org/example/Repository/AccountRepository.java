package org.example.Repository;

import org.example.Entity.Account;
import org.hibernate.Session;

public interface AccountRepository {
    public void save(Session session, Account account);
}
