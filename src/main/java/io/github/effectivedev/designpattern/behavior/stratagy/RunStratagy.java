package io.github.effectivedev.designpattern.behavior.stratagy;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RunStratagy implements MoveStratagy {

    @Override
    public void move() {
        log.info("i'm running");
    }
}
