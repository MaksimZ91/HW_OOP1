package org.example.Characters;

public class Monk extends MagikCharacter{
    int spirit;

    public Monk(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int mastery, int spirit) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy, mastery);
        this.spirit = spirit;
    }

    public Monk(String name) {
        super(name, 80, 90, 25, 25, 30, 7, 33);
        this.spirit = 45;
    }

    @Override
    public String getInfo() {
        return "Я монха!";
    }

    @Override
    public void step() {
        super.step();
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
}
