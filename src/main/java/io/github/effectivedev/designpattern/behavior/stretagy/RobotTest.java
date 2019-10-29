package io.github.effectivedev.designpattern.behavior.stretagy;

public class RobotTest {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setName("test");
        robot.setAttackStrategy(new MissileAttackStrategy());
        robot.setMoveStrategy(new FlyStrategy());
        robot.move();
        robot.attack();

    }

}