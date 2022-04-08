package javarunner.core.designpattern.state;

public class Pokemon {
    private Level level1,level2,level3,currentLevel;

    public Pokemon(){
        level1 = new Level1();
        level2 = new Level2();
        level3 = new Level3();
        currentLevel=level1;
    }

    public void changeLevel(Level changeLevel){
        this.currentLevel = changeLevel;
    }

    public Level getLevel1() { return this.level1; }
    public Level getLevel2() { return this.level2; }
    public Level getLevel3() { return this.level3; }

    public void printStats() {
        System.out.println("Attack : " + currentLevel.getAttackPoints() +   "\tDefense: "
                + currentLevel.getDefensePoints());
    }

}
