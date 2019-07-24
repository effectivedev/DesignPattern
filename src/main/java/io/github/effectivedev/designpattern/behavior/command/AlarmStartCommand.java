package io.github.effectivedev.designpattern.behavior.command;

public class AlarmStartCommand implements Command{

    private Alarm alram;

    public AlarmStartCommand(Alarm alram) {
        this.alram = alram;
    }

    @Override
    public void execute() {
        alram.start();
    }
}
