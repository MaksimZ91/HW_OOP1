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
        if (state.equals("Die") || this.shots <= 0) return;
        BaseCharacter enemy = teamEnemy.get(findeNearest(teamEnemy));
        System.out.println("Выстрелов до атаки:  " + this.shots);
        float damage = (enemy.defence - attac > 0) ? minDamage: (enemy.defence - attac < 0)? maxDamage : (maxDamage + minDamage)/2;
        enemy.getDamage(damage);
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
            if(hero.getInfo().split(" ")[1].equals("фермер") && hero.state.equals("Stand")){
                hero.state = "Busy";
                return;
            }
        }
        this.shots--;
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
