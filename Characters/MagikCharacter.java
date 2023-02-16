package org.example.Characters;

public abstract class MagikCharacter extends BaseCharacter {

    int mastery;

    public MagikCharacter(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int mastery) {
        super(currentHealh, maxHealh, damage, defence, speed, distancy);
        super.name = name;
        this.mastery = mastery;
    }

    @Override
    public String getInfo() {
        return "Я боец использующий магию";
    }

    @Override
    public void step() {
        super.step();
    }

    public int getMastery() {
        return mastery;
    }

    public void setMastery(int mastery) {
        this.mastery = mastery;
    }
}
