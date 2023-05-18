package com.example.lab34.repository;

import com.example.lab34.entity.MonHoc;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MonHocRepository implements IMonHocRepository {

    private static final ArrayList<MonHoc> danhSachMonHoc = new ArrayList<>();

    static {
        ArrayList<String> teachers1 = new ArrayList<>();
        ArrayList<String> teachers2 = new ArrayList<>();
        ArrayList<String> teachers3 = new ArrayList<>();
        ArrayList<String> teachers4 = new ArrayList<>();
        teachers1.add("NguyenVV4");
        teachers1.add("DungNA29");
        teachers2.add("DungNA29");
        teachers3.add("TienNH21");
        teachers3.add("MinhDQ8");
        teachers4.add("DungNA29");
        teachers4.add("TienNH21");

        danhSachMonHoc.add(new MonHoc("Mon1", "JAVA", 3, "UDPM", teachers1, true));
        danhSachMonHoc.add(new MonHoc("Mon2", "C#", 3, "PTPM", teachers2, false));
        teachers1.add("MinhDQ8");
        danhSachMonHoc.add(new MonHoc("Mon3", "SQL", 3, "UDPM", teachers4, true));
        danhSachMonHoc.add(new MonHoc("Mon4", "JS", 3, "CNTT", teachers3, false));
    }

    @Override
    public ArrayList<MonHoc> getAllMonHoc() {
        return danhSachMonHoc;
    }

    @Override
    public void addMonHoc(MonHoc mh) {
        danhSachMonHoc.add(mh);
    }
}
