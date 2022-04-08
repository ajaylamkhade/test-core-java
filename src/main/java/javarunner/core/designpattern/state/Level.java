package javarunner.core.designpattern.state;

public abstract class Level {

    protected int attackPoints;
    protected int defensePoints;

    public Level(){
        this.attackPoints=0;
        this.defensePoints=0;
    }

    public int getAttackPoints(){
        return this.attackPoints;
    }

    public int getDefensePoints(){
        return this.defensePoints;
    }

}
