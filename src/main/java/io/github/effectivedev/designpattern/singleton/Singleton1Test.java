package io.github.effectivedev.designpattern.singleton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        System.out.println(singleton2.getName());

        assertEquals(singleton1,singleton2);
    }
}