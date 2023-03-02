package org.example.Characters;

import java.util.ArrayList;

public class Crossbowman extends RangeCharacter{
    int energy;

    public Crossbowman(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int accuracy, int shots, int maxShots, int energy, int xCoord, int yCoord) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy, accuracy, shots, maxShots, xCoord, yCoord);
        this.energy = energy;
    }

    public Crossbowman(String name, int xCoord, int yCoord ) {
        super(name, 10,10,2,3,6,3,4,10,10,16,16, xCoord, yCoord);
        this.energy = 10;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t| ATK:\t").append(Crossbowman.super.attac)
                .append("\t| HP:\t").append(Crossbowman.super.currentHealh)
                .append(" \t| Arrows:").append(Crossbowman.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Crossbowman.super.coords.getxCords()).append(".").append(Crossbowman.super.coords.getyCords());
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2) {
        super.step(b1, b2);
    }

    public  void collectBolts(){
        System.out.println("Собирать болты");
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}


