package io.github.effectivedev.designpattern.stratagy;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class KickAttackStratagy implements AttackStratagy {

    @Override
    public void attack() {
        log.info("kick attack");
    }
}
