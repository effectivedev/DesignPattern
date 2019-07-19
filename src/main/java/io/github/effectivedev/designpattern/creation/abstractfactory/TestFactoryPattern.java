package io.github.effectivedev.designpattern.creation.abstractfactory;

public class TestFactoryPattern {
    private enum A{
        a, b, c;
    }
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));

        System.out.println(A.a);
    }
}
