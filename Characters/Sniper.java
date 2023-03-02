package org.example.Characters;

import java.util.ArrayList;

public class Sniper extends  RangeCharacter{
    int stealth;


    public Sniper(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int accuracy, int shots, int maxShots, int xCoord, int yCoord, int stealth) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy, accuracy, shots, maxShots, xCoord, yCoord);
        this.stealth = stealth;
    }

    public Sniper(String name, int xCoord, int yCoord) {
        super(name, 15, 15, 8, 10, 12, 10, 9, 10, 10,32,32, xCoord, yCoord);
        this.stealth = 5;
    }

    public  void cloaking(){
        System.out.println("С");
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attac)
                .append("\t| HP:\t").append(Sniper.super.currentHealh)
                .append(" \t| Arrows:").append(Sniper.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coords.getxCords()).append(".").append(Sniper.super.coords.getxCords());
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2) {
        super.step(b1, b2);
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }
}
