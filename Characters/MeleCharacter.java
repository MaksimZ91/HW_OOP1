package org.example.Characters;

import java.util.ArrayList;

public abstract class MeleCharacter extends BaseCharacter {
    int  agility, stamina;

    public MeleCharacter(String name, int currentHealh, int maxHealh, int midDamage, int maxDamage, int attac, int defence, int speed, int distancy, int agility, int stamina, int xCoord, int yCoord) {
        super(name, currentHealh, maxHealh, midDamage, maxDamage, attac, defence, speed, distancy, xCoord, yCoord);
        this.agility = agility;
        this.stamina = stamina;
    }

    @Override
    public String getInfo() {
        return "Я боец ближнего боя!";
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2 ) {
        super.step(b1, b2);
    }
}
