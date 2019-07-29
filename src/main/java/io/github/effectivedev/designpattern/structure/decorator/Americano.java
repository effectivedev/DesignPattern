package io.github.effectivedev.designpattern.structure.decorator;

public class Americano extends Beverage {
    Americano() {
        super();
        setDescription("Americano("+cost()+")");
    }

    @Override
    int cost() {
        return 2500;
    }
}
