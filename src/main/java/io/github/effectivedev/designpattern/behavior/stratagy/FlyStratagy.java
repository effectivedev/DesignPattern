package io.github.effectivedev.designpattern.behavior.stratagy;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FlyStratagy implements MoveStratagy {
    @Override
    public void move() {
       log.info("i can fly");
    }
}
