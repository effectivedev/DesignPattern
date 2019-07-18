package io.github.effectivedev.designpattern.behavior.flyweight;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
        log.info("create: {}", name);
    }
}
