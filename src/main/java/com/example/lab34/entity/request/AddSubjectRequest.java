package com.example.lab34.entity.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AddSubjectRequest {
    private String maMon;
    private String tenMon;
    private Integer soTinChi;
    private String chuyenNganh;
    private List<String> teachers;
    private Boolean batBuoc;
}
