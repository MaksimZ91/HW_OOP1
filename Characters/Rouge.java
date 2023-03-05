package org.example.Characters;

import java.util.ArrayList;

public class Rouge extends MeleCharacter{
    int luck;

    public Rouge(String name, int currentHealh, int maxHealh, int midDamage, int maxDamage, int attac, int defence, int speed, int distancy, int agility, int stamina, int xCoord, int yCoord, int luck) {
        super(name, currentHealh, maxHealh, midDamage, maxDamage, attac, defence, speed, distancy, agility, stamina, xCoord, yCoord);
        this.luck = luck;
    }

    public Rouge(String name, int xCoord, int yCoord) {
        super(name, 10, 10, 2, 4,8, 3, 6, 10, 10,10, xCoord, yCoord);
        this.luck = 10;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Rouge.super.name)
                .append("\t| ATK:\t").append(Rouge.super.attac)
                .append("\t| HP:\t").append(Rouge.super.currentHealh)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Rouge.super.coords.getxCords()).append(".").append(Rouge.super.coords.getyCords());
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2) {
        super.step(b1, b2);
    }



}
