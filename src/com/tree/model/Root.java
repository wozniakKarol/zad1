package com.tree.model;


public class Root {

    private Integer height;

    public Root(Integer height) {
        this.height = height;
    }


    public void grow() {
        this.height++;
        System.out.println("Root height " + height);
    }
}
