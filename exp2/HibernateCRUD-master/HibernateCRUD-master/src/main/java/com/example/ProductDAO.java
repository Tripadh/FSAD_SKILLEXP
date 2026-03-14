package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductDAO {

    public void insert(Product p) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(p);
        tx.commit();
        session.close();
    }

    public Product get(int id) {
        Session session = HibernateUtil.getFactory().openSession();
        Product p = session.get(Product.class, id);
        session.close();
        return p;
    }

    public void update(Product p) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(p);
        tx.commit();
        session.close();
    }

    public void delete(int id) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Product p = session.get(Product.class, id);
        if (p != null) {
            session.delete(p);
        }
        tx.commit();
        session.close();
    }
}
