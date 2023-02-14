package org.example.Characters;

public class Rouge extends BaseCharacter{
    int luck;
    int stealth;
    int agility;

    public Rouge(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int luck, int stealth, int agility) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy);
        this.luck = luck;
        this.stealth = stealth;
        this.agility = agility;
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

    public void setSecrecy(int secrecy) {
        this.stealth = secrecy;
    }

    public int getLuck() {
        return luck;
    }

    public int getSecrecy() {
        return stealth;
    }
}
