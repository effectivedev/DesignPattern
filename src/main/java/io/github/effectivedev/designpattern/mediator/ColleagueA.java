package io.github.effectivedev.designpattern.mediator;

public class ColleagueA extends Colleague{

    public ColleagueA(IMediator mediator) {
        this.mediator = mediator;
        this.mediator.registerA(this);
    }

    @Override
    public void doSomething() {
        this.mediator.talk();
    }
}
