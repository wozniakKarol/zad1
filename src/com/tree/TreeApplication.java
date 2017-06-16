package com.tree;


import com.tree.model.*;
import com.tree.service.LeafOrNeddleService;

public class TreeApplication {

    public static void main(String[] args) {
        LeafOrNeddleService leaf = new Leaf(2);
        LeafOrNeddleService neddle = new Neddle(3);
        Branch branchLeaf = new Branch(5);
        Branch branchNeddle = new Branch(6);
        branchLeaf.addLeafOrNeddle(leaf);
        branchNeddle.addLeafOrNeddle(neddle);
        Root rootLeafy = new Root(20);
        Root rootConifer = new Root(30);

        Tree leafy = new LeafyTree(rootLeafy, "Dąb");
        Tree conifer = new ConiferTree(rootConifer, "Sosna");
        leafy.addBranch(branchLeaf);
        conifer.addBranch(branchNeddle);
        leafy.growTree();
        conifer.growTree();
        leafy.winterIsComing();
        conifer.winterIsComing();
    }
}
