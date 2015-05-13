package com.hospital.dao;

import com.hospital.models.Drug;

import java.util.List;

/**
 * Created by kinyua on 5/7/15.
 */
public interface DrugDao {
    public int insertRowD(Drug drug);
    public List<Drug> getList();
}
