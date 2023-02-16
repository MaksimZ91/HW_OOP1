package org.example.Characters;

public abstract class MeleCharacter extends BaseCharacter {
    int  agility, stamina;

    public MeleCharacter(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy ,int stamina, int agility) {
        super(currentHealh, maxHealh, damage, defence, speed, distancy);
        super.name = name;
        this.stamina = stamina;
        this.agility = agility;
    }

    @Override
    public String getInfo() {
        return "Я боец ближнего боя!";
    }

    @Override
    public void step() {
        super.step();
    }
}
