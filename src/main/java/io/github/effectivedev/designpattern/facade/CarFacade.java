package io.github.effectivedev.designpattern.facade;

public class CarFacade {
    Car car;

    public CarFacade(Car car) {
        this.car = car;
    }

    public void drive(){
        car.engineStart();
        car.doorLock();
        car.wheelRoll();
    }

    public void stop(){
        car.engineStop();
        car.doorUnlock();
        car.wheelStop();
    }

    public void park(){
        car.engineStop();
        car.doorLock();
        car.wheelStop();
    }
}
