package io.github.effectivedev.designpattern.structure.composite;

public class File implements Node{
    private String name;

    @Override
    public String getName() {
        return name;
    }
}
