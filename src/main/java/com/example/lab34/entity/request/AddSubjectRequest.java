package com.example.lab34.entity.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AddSubjectRequest {
    private String code;
    private String name;
    private Integer credit;
    private String major;
    private List<String> teachers;
    private Boolean isRequired;
}
