package com.hospital.dao;

import com.hospital.models.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by kinyua on 5/8/15.
 */
public class PatientDrugDaoImpl implements PatientDrugDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Patient> getJointList(){
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Patient> patientJointList = session.createQuery("from Patient").list();
        session.close();
        return patientJointList;

    }
}
