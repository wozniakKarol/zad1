package com.tree.model;


import com.tree.service.LeafOrNeddleService;

public class Neddle implements LeafOrNeddleService {

    private Integer size;

    public Neddle(Integer size) {
        this.size = size;
    }

    @Override
    public void growLeafOrNeddle() {
        this.size++;
        System.out.println("Neddle size " + size);
    }

    @Override
    public void throwLeaf() {

    }

}
