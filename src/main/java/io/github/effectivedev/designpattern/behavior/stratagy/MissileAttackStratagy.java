package io.github.effectivedev.designpattern.behavior.stratagy;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MissileAttackStratagy implements AttackStratagy {
    @Override
    public void attack() {
        log.info("Missile attack~~~~~~~`");
    }
}
