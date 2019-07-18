package io.github.effectivedev.designpattern.structure.memento;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
        log.info("Originator: Setting state to " + state);
    }

    public Memento saveToMemento(){
        log.info("Originator : Saving to Memento");
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento){
        this.state = memento.getSavedState();
        log.info("Originator: State after restoring from Memento: " + state);
    }
}
