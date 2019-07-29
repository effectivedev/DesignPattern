package io.github.effectivedev.designpattern.structure.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Americano americano = new Americano();
        System.out.println(americano.cost());
        Beverage milkAmericano = new ShotOption(new MilkOption(americano));
        System.out.println(milkAmericano.cost());
        System.out.println(milkAmericano.getDescription());

    }
}
