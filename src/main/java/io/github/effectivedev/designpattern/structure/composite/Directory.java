package io.github.effectivedev.designpattern.structure.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory implements Node{
    String name;
    List<Node> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void ls() {
        Iterator it = children.iterator();
        System.out.println(Manager.compositeBuilder + getName());
        Manager.compositeBuilder.append("     ");
        while (it.hasNext()) {
            Node node = (Node) it.next();
            node.ls();
        }
    }

    public void add(Node node){
        children.add(node);
    }

}
