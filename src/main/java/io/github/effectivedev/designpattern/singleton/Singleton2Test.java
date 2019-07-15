package io.github.effectivedev.designpattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class Singleton2Test{

    @Test
    public void Test() {
        Singleton2 singleton1 = Singleton2.getINSTANCE();

        Singleton2 singleton2 = Singleton2.getINSTANCE();
        log.info(String.valueOf(singleton1 == singleton2));
        assertEquals(singleton1, singleton2);
    }

}