package com.hospital.services;

import com.hospital.models.Drug;

import java.util.List;

/**
 * Created by kinyua on 5/7/15.
 */
public interface DrugService {
    public int insertRowD(Drug drug);
    public List<Drug> getList();
}
