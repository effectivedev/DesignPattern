package io.github.effectivedev.designpattern.structure.decorator;

public class ShotOption extends AddOption{
    ShotOption(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int price() {
        return 300;
    }

    @Override
    public String addComment() {
        return ", shot add(" +price() +")";
    }
}
