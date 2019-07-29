package io.github.effectivedev.designpattern.structure.decorator;

public class MilkOption extends AddOption{
    MilkOption(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int price() {
        return 500;
    }

    @Override
    public String addComment() {
        return ", milk add(" +price() +")";
    }
}
