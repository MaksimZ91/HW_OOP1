package org.example.Characters;

public class Rouge extends MeleCharacter{
    int luck;

    public Rouge(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int stamina, int agility, int luck) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy, stamina, agility);
        this.luck = luck;
    }

    public Rouge(String name) {
        super(name, 100, 120, 33, 25, 50, 2, 14, 15);
        this.luck = 10;
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }

    @Override
    public void step() {
        super.step();
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
