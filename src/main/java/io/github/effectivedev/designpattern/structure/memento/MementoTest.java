package io.github.effectivedev.designpattern.structure.memento;

public class MementoTest {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        careTaker.add(originator.saveToMemento());
        originator.setState("State3");

        careTaker.add(originator.saveToMemento());
        originator.setState("State4");

        originator.restoreFromMemento(careTaker.get(0));

    }

}