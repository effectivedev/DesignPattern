package io.github.effectivedev.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OriginatorTest {

    public static void main(String[] args) {

        List<Originator.Memento> savedStatus = new ArrayList<>();

        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        savedStatus.add(originator.saveToMemento());
        originator.setState("State3");

        savedStatus.add(originator.saveToMemento());
        originator.setState("State4");

        originator.restoreFromMemento(savedStatus.get(0));

    }

}