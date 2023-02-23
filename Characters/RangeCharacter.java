package org.example.Characters;

import java.util.ArrayList;

public abstract  class RangeCharacter extends BaseCharacter {

    int accuracy, shots, maxShots;

    public RangeCharacter(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int accuracy, int shots, int maxShots, int xCoord, int yCoord) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy, xCoord, yCoord);
        this.accuracy = accuracy;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    @Override
    public String getInfo() {
        return "Я боец дальнего боя!";
    }

    @Override
    public void step(ArrayList<BaseCharacter> frends, ArrayList <BaseCharacter> teamEnemy ) {
        if (this.currentHealh <= 0 || this.shots <= 0) return; //3.1
        BaseCharacter enemy = teamEnemy.get(super.findeNearest(teamEnemy)); //3.2
        System.out.println("Выстрелов до атаки:  " + this.shots);
        enemy.setCurrentHealh(enemy.getCurrentHealh() - super.attack()); //3.3
        System.out.println("--------------------------------------");
        System.out.printf("Атакован ---> Имя: %s, %s, health: %d, скорость: %d, x: %d, y: %d \n" ,
                enemy.getName(),
                enemy.getInfo(),
                enemy.getCurrentHealh(),
                enemy.getSpeed(),
                enemy.getXCoords(),
                enemy.getYCoords());
        System.out.println("--------------------------------------");
        for (BaseCharacter hero: frends) {
            if(hero instanceof Fermer && hero.getCurrentHealh() > 0) return; //3.4
        }
        this.shots = this.shots -1;  //3.5
        System.out.println("Выстрелов после атаки: " + this.shots);
    }

    public  void reload(){
        System.out.println("Перезарядка");
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getMaxShots() {
        return maxShots;
    }

    public void setMaxShots(int maxShots) {
        this.maxShots = maxShots;
    }
}
