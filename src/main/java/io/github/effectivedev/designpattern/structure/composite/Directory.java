package io.github.effectivedev.designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Node{
    String name;
    List<Node> children = new ArrayList<>();


    @Override
    public String getName() {
        return name;
    }

    public void add(Node node){
        children.add(node);
    }

}
