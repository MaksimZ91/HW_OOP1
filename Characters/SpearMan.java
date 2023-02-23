package org.example.Characters;

import java.util.ArrayList;

public class SpearMan extends MeleCharacter {

    private int strange;


    public SpearMan(String name, int currentHealh, int maxHealh, int midDamage, int maxDamage, int attac, int defence, int speed, int distancy, int agility, int stamina, int xCoord, int yCoord, int strange) {
        super(name, currentHealh, maxHealh, midDamage, maxDamage, attac, defence, speed, distancy, agility, stamina, xCoord, yCoord);
        this.strange = strange;
    }

    public SpearMan(String name,int xCoord, int yCoord) {
        super(name, 10, 10, 1, 3, 4, 5, 4, 10,10,10, xCoord, yCoord);
        this.strange = 10;
    }

    @Override
    public String getInfo() {
        return "Я копейщик!";
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2) {
        super.step(b1, b2);
    }

    public void fear() {
        System.out.println("Наводит ужас");
    }

    public void taunt() {
        System.out.println("Провоцирует");
    }

    public void throwSpear() {
        System.out.println("Метает копье");
    }

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }
}

