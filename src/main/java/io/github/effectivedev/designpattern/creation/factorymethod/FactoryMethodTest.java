package io.github.effectivedev.designpattern.creation.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Car luxuryCar = CarFactory.buildCar(CarType.LUXURY);
        Car sedanCar = CarFactory.buildCar(CarType.SEDAN);
        Car smallCar = CarFactory.buildCar(CarType.SMALL);

        System.out.println(luxuryCar);
        System.out.println(sedanCar);
        System.out.println(smallCar);
    }
}
