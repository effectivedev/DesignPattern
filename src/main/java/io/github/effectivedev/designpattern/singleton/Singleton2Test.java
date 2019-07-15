package io.github.effectivedev.designpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class Singleton2Test{

    @Test
    public void Test() {
        Singleton2 singleton1 = Singleton2.getINSTANCE();

        Singleton2 singleton2 = Singleton2.getINSTANCE();
        System.out.println(singleton1 == singleton2);
        assertEquals(singleton1, singleton2);
    }

}