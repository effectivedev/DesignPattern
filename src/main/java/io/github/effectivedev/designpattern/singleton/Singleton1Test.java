package io.github.effectivedev.designpattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class Singleton1Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.setName("singleton1");
        Singleton1 singleton2 = Singleton1.getInstance();
        log.info(singleton2.getName());

        assertEquals(singleton1,singleton2);
    }
}