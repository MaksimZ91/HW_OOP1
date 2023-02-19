package org.example.Characters;

import java.util.ArrayList;

public class Rouge extends MeleCharacter{
    int luck;

    public Rouge(String name, int currentHealh, int maxHealh, int midDamage, int maxDamage, int attac, int defence, int speed, int distancy, int agility, int stamina, int luck) {
        super(name, currentHealh, maxHealh, midDamage, maxDamage, attac, defence, speed, distancy, agility, stamina);
        this.luck = luck;
    }

    public Rouge(String name) {
        super(name, 10, 10, 2, 4,8, 3, 6, 10, 10,10);
        this.luck = 10;
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2) {
        super.step(b1, b2);
    }

    public void steal (){
        System.out.println("Крадемся");
    }

    public void trick (){
        System.out.println("Обман / уловка");
    }

    public void theft (){
        System.out.println("кража");
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getLuck() {
        return luck;
    }

}
