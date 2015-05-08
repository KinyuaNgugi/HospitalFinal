package com.hospital.services;

import com.hospital.dao.PatientDao;
import com.hospital.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by kinyua on 5/5/15.
 */
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientDao patientDao;
    
    @Override
    public int insertRow(Patient patient) {
        return patientDao.insertRow(patient);
    }


    @Override
    public List<Patient> getList() {
        return patientDao.getList();
    }

}
