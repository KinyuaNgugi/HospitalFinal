package com.hospital.services;

import com.hospital.models.Patient;

import java.util.List;

/**
 * Created by kinyua on 5/5/15.
 */
public interface PatientService {
    public int insertRow(Patient patient);

    public List<Patient> getList();
}
