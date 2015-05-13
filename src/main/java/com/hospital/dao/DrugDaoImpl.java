package com.hospital.dao;

import com.hospital.models.Drug;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by kinyua on 5/7/15.
 */
public class DrugDaoImpl implements DrugDao {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int insertRowD(Drug drug) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(drug);
        tx.commit();
        Serializable id = session.getIdentifier(drug);
        session.close();
        return (Integer) id;
    }
    @Override
    public List<Drug> getList() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Drug> drugList = session.createQuery("from Drug drug").list();
        session.close();
        return drugList;
    }
}