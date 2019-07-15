package io.github.effectivedev.designpattern.mediator;

public class ColleagueB extends Colleague{

    public ColleagueB(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doSomething() {
        this.mediator.talk();
        this.mediator.fight();

    }
}
