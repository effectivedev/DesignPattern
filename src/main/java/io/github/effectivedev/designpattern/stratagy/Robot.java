package io.github.effectivedev.designpattern.stratagy;

public class Robot {
    private String name;
    private AttackStratagy attackStratagy;
    private MoveStratagy moveStratagy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttackStratagy getAttackStratagy() {
        return attackStratagy;
    }

    public void setAttackStratagy(AttackStratagy attackStratagy) {
        this.attackStratagy = attackStratagy;
    }

    public MoveStratagy getMoveStratagy() {
        return moveStratagy;
    }

    public void setMoveStratagy(MoveStratagy moveStratagy) {
        this.moveStratagy = moveStratagy;
    }

    public void attack(){
        this.attackStratagy.attack();
    }

    public void move(){
        this.moveStratagy.move();
    }
}
