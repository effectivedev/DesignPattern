package io.github.effectivedev.designpattern.structure.decorator;

public abstract class Beverage {
    String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract int cost();
}
