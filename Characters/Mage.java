package org.example.Characters;

public class Mage extends  BaseCharacter {
    int currentMana;
    int maxMana;

    public Mage(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int currentMana, int maxMana) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy);
        this.currentMana = currentMana;
        this.maxMana = maxMana;
    }

    public void curse (){
        System.out.println("Наклыдывать проклятие");
    }
    public void blink (){
        System.out.println("телепор");
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public int getMaxMana() {
        return maxMana;
    }
}
