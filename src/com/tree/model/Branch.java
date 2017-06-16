package com.tree.model;


import com.tree.service.LeafOrNeddleService;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private Integer length;
    private List<LeafOrNeddleService> leafOrNeddleServiceList;

    public Branch(Integer length) {
        this.length = length;
        this.leafOrNeddleServiceList = new ArrayList<>();
    }

    public void addLeafOrNeddle(LeafOrNeddleService e) {
        leafOrNeddleServiceList.add(e);
    }

    public void growBranch() {
        this.length++;
        System.out.println("Branch length " + length);
        leafOrNeddleServiceList.forEach(LeafOrNeddleService::growLeafOrNeddle);
    }

    public void throwLeaf() {
        leafOrNeddleServiceList.forEach(LeafOrNeddleService::throwLeaf);
    }
}
