package io.github.effectivedev.designpattern.creation.singleton;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Log4j2
public class Singleton3Test {

    @Test
    public void getInstance() {
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        singleton1.setTest("tt");
        log.info(singleton1.toString());
        log.info(singleton1.getTest());
        log.info(singleton2.toString());
        assertEquals(singleton1, singleton2);
        log.info(singleton2.getTest());
    }
}