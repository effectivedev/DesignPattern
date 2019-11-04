package io.github.effectivedev.designpattern.creation.factorymethod;

public class SendanCar extends Car {

    public SendanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Sedan Car");
    }

}
