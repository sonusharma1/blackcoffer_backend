package com.blackcoffer.controller;

import com.blackcoffer.entity.Data;
import com.blackcoffer.service.DataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataServiceImpl dataService;

    @GetMapping("/getAll")
    public List<Data> getAllData() {
        return dataService.getAllData();
    }
}
