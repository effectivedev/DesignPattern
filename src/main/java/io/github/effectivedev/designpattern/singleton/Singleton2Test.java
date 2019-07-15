package io.github.effectivedev.designpattern.singleton;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Log4j2
public class Singleton2Test{

    @Test
    public void Test() {
        Singleton2 singleton1 = Singleton2.getINSTANCE();

        Singleton2 singleton2 = Singleton2.getINSTANCE();
        log.info(String.valueOf(singleton1 == singleton2));
        assertEquals(singleton1, singleton2);
    }

}