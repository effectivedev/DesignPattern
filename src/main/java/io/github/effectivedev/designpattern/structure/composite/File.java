package io.github.effectivedev.designpattern.structure.composite;

public class File implements Node{
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void ls() {
        System.out.println(Manager.compositeBuilder + getName());
    }
}
