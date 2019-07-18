package io.github.effectivedev.designpattern.behavior.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        User robert = new User("robert");
        User john = new User("john");

        robert.sendMessage("robert");
        john.sendMessage("john");
    }
}
