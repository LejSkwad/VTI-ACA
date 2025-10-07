package org.example.Service;

import org.example.Entity.Account;
import org.example.Entity.Department;
import org.example.Entity.Position;
import org.example.Repository.AccountRepository;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.beanvalidation.HibernateTraversableResolver;

public class AccountService {
    private AccountRepository accountRepository;

    //constructor
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(String department,String position,String email){
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();

            Department departmentRef = session.getReference(Department.class, department);
            Position positionRef = session.getReference(Position.class, position);

            Account account = new Account();
            account.setDepartment(departmentRef);
            account.setPosition(positionRef);
            session.save(account);
            transaction.commit();

            accountRepository.save(session,account);
        }
    }
}
