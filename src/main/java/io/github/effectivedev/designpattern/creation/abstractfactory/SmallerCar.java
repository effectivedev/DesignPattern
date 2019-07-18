package io.github.effectivedev.designpattern.creation.abstractfactory;

public class SmallerCar extends Car {
    public SmallerCar(Location location) {
        super(CarType.SMALL, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Small Car");
    }
}
