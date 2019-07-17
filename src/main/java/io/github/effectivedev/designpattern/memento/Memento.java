package io.github.effectivedev.designpattern.memento;

public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    String getSavedState(){
        return state;
    }
}
