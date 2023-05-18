package com.example.lab34.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MonHoc {

    private String maMon;

    private String tenMon;

    private Integer soTinChi;

    private String chuyenNganh;

    private ArrayList<String> teachers;

    private Boolean batBuoc;

    public String getTeachers() {
        return teachers.stream().collect(Collectors.joining(", "));
    }

}
