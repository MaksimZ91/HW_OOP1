package org.example.Characters;

import java.util.ArrayList;

public abstract class MagikCharacter extends BaseCharacter {

    int mastery;

    public MagikCharacter(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int mastery) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy);
        this.mastery = mastery;
    }

    @Override
    public String getInfo() {
        return "Я боец использующий магию";
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2 ) {
        super.step(b1, b2);
    }

    public int getMastery() {
        return mastery;
    }

    public void setMastery(int mastery) {
        this.mastery = mastery;
    }
}
