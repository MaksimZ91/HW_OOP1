package org.example.Characters;

import java.util.ArrayList;

public class Crossbowman extends RangeCharacter{
    int energy;

    public Crossbowman(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int accuracy, int shots, int maxShots, int energy) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy, accuracy, shots, maxShots);
        this.energy = energy;
    }

    public Crossbowman(String name) {
        super(name, 10,10,2,3,6,3,4,10,10,16,16);
        this.energy = 10;
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
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


