package io.github.effectivedev.designpattern.behavior.stretagy;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MissileAttackStrategy implements AttackStrategy {
    @Override
    public void attack() {
        log.info("Missile attack~~~~~~~`");
    }
}
