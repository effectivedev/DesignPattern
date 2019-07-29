package io.github.effectivedev.designpattern.structure.decorator;

public abstract class AddOption extends Beverage{
    Beverage beverage;

    AddOption(Beverage beverage){
        this.beverage = beverage;
        this.description = beverage.getDescription() + addComment();
    }
    @Override
    int cost() {
       return this.beverage.cost() + price();
    }

    public abstract int price();
    public abstract String addComment();
}
