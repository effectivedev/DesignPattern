package io.github.effectivedev.designpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class Singleton3Test {

    @Test
    public void getInstance() {
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        singleton1.setTest("tt");
        System.out.println(singleton1);
        System.out.println(singleton1.getTest());
        System.out.println(singleton2);
        assertEquals(singleton1, singleton2);
        System.out.println(singleton2.getTest());
    }
}