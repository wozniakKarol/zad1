package com.tree.model;


public class LeafyTree extends Tree {


    public LeafyTree(Root root, String name) {
        super(root, name);
    }

    @Override
    public void growTree() {
        System.out.println("Grow Leafy Tree " + name);
        super.growTree();
    }

    @Override
    public void winterIsComing() {
        System.out.println("Winter is coming");
        branches.forEach(Branch::throwLeaf);
    }
}
