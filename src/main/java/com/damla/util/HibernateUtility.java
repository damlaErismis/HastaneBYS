package com.damla.util;


import com.damla.entity.Doktor;
import com.damla.entity.Hasta;
import com.damla.entity.Muayene;
import com.damla.entity.Tahlil;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();
    private static SessionFactory sessionFactoryHibernate() {
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Doktor.class);
            configuration.addAnnotatedClass(Tahlil.class);
            configuration.addAnnotatedClass(Muayene.class);
            configuration.addAnnotatedClass(Hasta.class);


            SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            return factory;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}

