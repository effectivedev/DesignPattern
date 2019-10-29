package io.github.effectivedev.designpattern.behavior.stretagy;

public class Robot {
    private String name;
    private AttackStrategy attackStrategy;
    private MoveStrategy moveStrategy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void attack(){
        this.attackStrategy.attack();
    }

    public void move(){
        this.moveStrategy.move();
    }
}
