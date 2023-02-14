package org.example.Characters;

public class Monk extends BaseCharacter{
    int spirit;
    int mastery;
    public Monk(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int spirit, int mastery) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy);
        this.spirit = spirit;
        this.mastery = mastery;
    }

    public void comfort(){
        System.out.println("Успокаивать");
    }

    public void train(){
        System.out.println("Тренировать");
    }
    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public int getMastery() {
        return mastery;
    }

    public void setMastery(int mastery) {
        this.mastery = mastery;
    }
}
