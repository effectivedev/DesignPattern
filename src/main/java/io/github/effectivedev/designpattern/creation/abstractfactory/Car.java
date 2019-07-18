package io.github.effectivedev.designpattern.creation.abstractfactory;

public abstract class Car {
    private CarType model = null;
    private Location location = null;

    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    protected abstract void construct();

    @Override
    public String toString() {
        return "Model-" + model + " built in " + location;
    }
}
