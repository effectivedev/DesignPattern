package io.github.effectivedev.designpattern.facade;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    public void engineStop(){
        log.info("engine Stop");
    }
    public void engineStart(){
        log.info("engine Start");
    }
    public void doorLock(){
        log.info("door locked");
    }
    public void doorUnlock(){
        log.info("door unlocked");
    }
    public void wheelRoll(){
        log.info("wheels roll");
    }
    public void wheelStop(){
        log.info("wheels Stop");
    }
}
