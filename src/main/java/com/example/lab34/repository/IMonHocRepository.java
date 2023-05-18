package com.example.lab34.repository;

import com.example.lab34.entity.MonHoc;

import java.util.ArrayList;

public interface IMonHocRepository {

    ArrayList<MonHoc> getAllMonHoc();

    void addMonHoc(MonHoc mh);
}
