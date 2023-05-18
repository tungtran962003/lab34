package com.example.lab34.controller;

import com.example.lab34.entity.MonHoc;
import com.example.lab34.entity.request.AddSubjectRequest;
import com.example.lab34.service.IMonHocService;
import com.example.lab34.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/lab34")
public class MonHocController {

    @Autowired
    private IMonHocService iMonHocService;

    @GetMapping("/bai-1")
    public String getAllMonHoc(Model model) {
        ArrayList<MonHoc> listMonHoc = iMonHocService.getAllMonHoc();
        model.addAttribute("listMonHoc", listMonHoc);
        return "lab34/bai-1";
    }

    @PostMapping("/add")
//    public String addMonHoc(Model model, @RequestParam(name = "maMon") String maMon,
//                            @RequestParam(name = "tenMon") String tenMon,
//                            @RequestParam(name = "soTinChi") Integer soTinChi,
//                            @RequestParam(name = "chuyenNganh") String chuyenNganh,
//                            @RequestParam(name = "MinhDQ8") String minhDQ8,
//                            @RequestParam(name = "TienNH21") String tienNH21,
//                            @RequestParam(name = "NguyenVV4") String nguyenVV4,
//                            @RequestParam(name = "DungNA29") String dungNA29,
//                            @RequestParam(name = "batBuoc") Boolean batBuoc){

    public String addMonHoc(Model model, @RequestBody AddSubjectRequest request) {
        ArrayList<String> teachers = new ArrayList<>();
//        teachers.add(minhDQ8);
//        teachers.add(tienNH21);
//        teachers.add(nguyenVV4);
//        teachers.add(dungNA29);
//        MonHoc mh = new MonHoc(maMon, tenMon, soTinChi, chuyenNganh, teachers, batBuoc);
//        iMonHocService.addMonHoc(mh);
        return "redirect:/lab34/bai1";
    }
}
