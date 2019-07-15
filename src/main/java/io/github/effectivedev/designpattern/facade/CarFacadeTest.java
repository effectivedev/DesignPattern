package io.github.effectivedev.designpattern.facade;

import org.junit.Before;
import org.junit.Test;

public class CarFacadeTest {
    CarFacade facade;

    @Before
    public void before(){
        facade = new CarFacade(new Car());
    }

    @Test
    public void drive() {
        facade.drive();
    }

    @Test
    public void stop() {
        facade.stop();
    }

    @Test
    public void park() {
        facade.park();
    }
}