package com.example.lab34.service;

import com.example.lab34.entity.MonHoc;

import java.util.ArrayList;

public interface IMonHocService {

    ArrayList<MonHoc> getAllMonHoc();

    void addMonHoc(MonHoc mh);
}
