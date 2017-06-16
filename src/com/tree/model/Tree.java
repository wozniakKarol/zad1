package com.tree.model;


import java.util.ArrayList;
import java.util.List;

public abstract class Tree {

    private Root root;
    protected List<Branch> branches;
    protected String name;


    public Tree(Root root, String name) {
        this.root = root;
        this.branches = new ArrayList<>();
        this.name = name;
    }

    public void addBranch(Branch b) {
        branches.add(b);
    }

    public abstract void winterIsComing();

    public void growTree() {
        root.grow();
        branches.forEach(Branch::growBranch);
    }
}
