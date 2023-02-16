package org.example.Characters;

public class Mage extends  MagikCharacter {
    int currentMana;
    int maxMana;

    public Mage(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int mastery, int currentMana, int maxMana) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy, mastery);
        this.currentMana = currentMana;
        this.maxMana = maxMana;
    }

    public Mage(String name) {
        super(name, 100, 110, 45, 20, 35, 7, 15);
        this.currentMana = 50;
        this.maxMana = 100;
    }

    @Override
    public String getInfo() {
        return "Я маг!";
    }

    @Override
    public void step() {
        super.step();
    }

    public void curse (){
        System.out.println("Наклыдывать проклятие");
    }
    public void blink (){
        System.out.println("телепор");
    }


}
