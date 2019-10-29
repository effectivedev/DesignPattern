package io.github.effectivedev.designpattern.behavior.stretagy;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class KickAttackStrategy implements AttackStrategy {

    @Override
    public void attack() {
        log.info("kick attack");
    }
}
