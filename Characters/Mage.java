package org.example.Characters;

import java.util.ArrayList;

public class Mage extends  MagikCharacter {
    int currentMana;
    int maxMana;

    public Mage(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int mastery, int currentMana, int maxMana) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy, mastery);
        this.currentMana = currentMana;
        this.maxMana = maxMana;
    }

    public Mage(String name) {
        super(name, 30, 30, -5, -5, 17, 12, 9,10,10);
        this.currentMana = 1;
        this.maxMana = 1;
    }

    @Override
    public String getInfo() {
        return "Я маг!";
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2 ) {
        super.step(b1, b2);
    }

    public void curse (){
        System.out.println("Наклыдывать проклятие");
    }
    public void blink (){
        System.out.println("телепор");
    }


}
