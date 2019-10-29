package io.github.effectivedev.designpattern.behavior.stretagy;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FlyStrategy implements MoveStrategy {
    @Override
    public void move() {
       log.info("i can fly");
    }
}
