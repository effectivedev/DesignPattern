package io.github.effectivedev.designpattern.creation.abstractfactory;

public class DefaultCarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SMALL:
                car = new SmallerCar(Location.DEFAULT);
                break;
            case SEDAN:
                car = new SedanCar(Location.DEFAULT);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;
            default:
                break;
        }
        return car;
    }
}
