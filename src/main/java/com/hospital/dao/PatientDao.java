package com.hospital.dao;

import com.hospital.models.Patient;

import java.util.List;

/**
 * Created by kinyua on 5/8/15.
 */
public interface PatientDao {
    public int insertRow(Patient patient);
    public List<Patient> getList();
}
