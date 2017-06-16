package com.tree.model;


public class ConiferTree extends Tree {



    public ConiferTree(Root root, String name) {
        super(root, name);
    }



    @Override
    public void growTree() {
        System.out.println("Grow Conifer Tree " + name);
        super.growTree();
    }

    @Override
    public void winterIsComing() {

    }
}
