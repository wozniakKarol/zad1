package com.tree.model;

import com.tree.service.LeafOrNeddleService;


public class Leaf implements LeafOrNeddleService {

    private Integer size;


    public Leaf(Integer size) {
        this.size = size;
    }

    @Override
    public void growLeafOrNeddle() {
        this.size++;
        System.out.println("Leaf size " + size);
    }

    @Override
    public void throwLeaf() {
        this.size = 0;
    }

}
