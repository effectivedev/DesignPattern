package io.github.effectivedev.designpattern.mediator;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConcreteMediator implements IMediator{
    ColleagueA talk;
    ColleagueB fight;

    @Override
    public void fight() {
        log.info("Mediator is fighting");
    }

    @Override
    public void talk() {
        log.info("Mediator is talking");
    }

    @Override
    public void registerA(ColleagueA a) {
        talk = a;
    }

    @Override
    public void registerB(ColleagueB b) {
        fight = b;
    }
}
