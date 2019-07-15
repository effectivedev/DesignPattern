package io.github.effectivedev.designpattern.flyweight;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import static org.junit.Assert.*;

@Log4j2
public class FlyweightTest {

    @Test
    public void fligtWeight(){
        Flyweight flyweight = new Flyweight();
        flyweight.getSubject("a");
        flyweight.getSubject("a");
        flyweight.getSubject("a");
        flyweight.getSubject("a");
        flyweight.getSubject("a");
        flyweight.getSubject("b");
        flyweight.getSubject("b");
    }
}