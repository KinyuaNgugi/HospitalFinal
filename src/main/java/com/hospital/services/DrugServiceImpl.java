package com.hospital.services;

import com.hospital.dao.DrugDao;
import com.hospital.models.Drug;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by kinyua on 5/7/15.
 */
public class
        DrugServiceImpl implements DrugService {
    @Autowired
    DrugDao drugDao;

    @Override
    public int insertRowD(Drug drug) {
        return drugDao.insertRowD(drug);
    }
    @Override
    public List<Drug> getList() {
        return drugDao.getList();
    }
}