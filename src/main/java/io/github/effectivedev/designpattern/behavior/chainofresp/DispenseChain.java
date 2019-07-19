package io.github.effectivedev.designpattern.behavior.chainofresp;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
