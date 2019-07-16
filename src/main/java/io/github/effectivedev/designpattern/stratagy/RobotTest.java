package io.github.effectivedev.designpattern.stratagy;

import static org.junit.Assert.*;

public class RobotTest {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setName("test");
        robot.setAttackStratagy(new MissileAttackStratagy());
        robot.setMoveStratagy(new FlyStratagy());
        robot.move();
        robot.attack();

    }

}