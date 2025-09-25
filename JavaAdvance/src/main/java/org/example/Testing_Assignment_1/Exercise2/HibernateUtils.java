package org.example.Testing_Assignment_1.Exercise2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory;
    private static HibernateUtils instance;

    private HibernateUtils() {
    }

    //singleton Pattern
    public static synchronized HibernateUtils getInstance() {
        if (instance == null) {
            instance = new HibernateUtils();
        }
        return instance;
    }

    private Configuration configure() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        return configuration;
    }

    public SessionFactory buildSessionFactory() {
        if (sessionFactory == null || sessionFactory.isClosed()) {
            sessionFactory = configure().buildSessionFactory();
        }
        return sessionFactory;
    }

    public void closeFactory() {
        if (sessionFactory != null || sessionFactory.isOpen()) {
            sessionFactory.close();
        }
    }

    public Session openSession() {
        return buildSessionFactory().openSession();
    }
}