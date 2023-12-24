package com.blackcoffer.service;

import com.blackcoffer.entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blackcoffer.repository.DataRepository;

import java.util.List;

@Service
public class DataServiceImpl {

    @Autowired
    private DataRepository dataRepository;

    public List<Data> getAllData() {
        return dataRepository.findAll();
    }
}
