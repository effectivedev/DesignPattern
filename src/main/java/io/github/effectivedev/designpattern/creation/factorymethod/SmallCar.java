package io.github.effectivedev.designpattern.creation.factorymethod;

public class SmallCar extends Car {

    public SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Small Car");
    }

}
