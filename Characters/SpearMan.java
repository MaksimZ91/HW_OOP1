package org.example.Characters;

public class SpearMan extends MeleCharacter {

    private int strange;


    public SpearMan(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int stamina, int agility, int strange) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy, stamina, agility);
        this.strange = strange;
    }

    public SpearMan(String name) {
        super(name, 120, 150, 52, 60, 30, 2, 15, 2);
        this.strange = 10;
    }

    @Override
    public String getInfo() {
        return "Я копейщик!";
    }

    @Override
    public void step() {
        super.step();
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

