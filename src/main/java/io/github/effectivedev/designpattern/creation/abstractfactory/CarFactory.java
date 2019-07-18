package io.github.effectivedev.designpattern.creation.abstractfactory;

public class CarFactory {

    private CarFactory(){

    }

    public static Car buildCar(CarType type){
        Car car = null;
        Location location = Location.ASIA;

        switch(location){
            case USA:
                car = UsaCarFactory.buildCar(type);
                break;
            case ASIA:
                car = AsiaCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
        }
        return car;
    }
}
