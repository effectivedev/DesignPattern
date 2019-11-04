package io.github.effectivedev.designpattern.creation.factorymethod;

public abstract class Car {
    private CarType model;
    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }
    //Do subclass level processing in this method
    protected void arrangeParts(){

    }
    //Do subclass level processing in this method
    protected abstract void construct();

    public CarType getModel() {
        return model;
    }
    public void setModel(CarType model) {
        this.model = model;
    }
}
