package com.example.lab34.service;

import com.example.lab34.entity.MonHoc;
import com.example.lab34.repository.IMonHocRepository;
import com.example.lab34.repository.MonHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MonHocService implements IMonHocService{

    @Autowired
    private IMonHocRepository iMonHocRepository;
    @Override
    public ArrayList<MonHoc> getAllMonHoc() {
        return iMonHocRepository.getAllMonHoc();
    }

    @Override
    public void addMonHoc(MonHoc mh) {
        iMonHocRepository.addMonHoc(mh);
    }


}
