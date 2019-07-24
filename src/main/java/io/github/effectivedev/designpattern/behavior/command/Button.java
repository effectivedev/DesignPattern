package io.github.effectivedev.designpattern.behavior.command;

public class Button {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressed() {
        command.execute();
    }
}
