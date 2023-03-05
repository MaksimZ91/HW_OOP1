package org.example.Characters;

import java.util.ArrayList;

public class Mage extends  MagikCharacter {
    int currentMana;
    int maxMana;

    public Mage(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int xCoord, int yCoord, int currentMana, int maxMana) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy,  xCoord, yCoord);
        this.currentMana = currentMana;
        this.maxMana = maxMana;
    }

    public Mage(String name, int xCoord, int yCoord) {
        super(name, 30, 30, -5, -5, 17, 12, 9,10,  xCoord,  yCoord);
        this.currentMana = 1;
        this.maxMana = 1;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Хиллер: \t").append(Mage.super.name)
                .append("\t| ATK:\t").append(Mage.super.attac)
                .append("\t| HP:\t").append(Mage.super.currentHealh)
                .append(" \t| MP:\t").append(Mage.super.magik)
                .append("\t|").append("\t| (X.Y) : ").append(Mage.super.coords.getxCords()).append(".").append(Mage.super.coords.getyCords());
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2  ) {
        super.step(b1, b2);

    }


}
