package org.example.Characters;

import java.util.ArrayList;

public class Monk extends MagikCharacter{
    int spirit;

    public Monk(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int mastery, int spirit) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy, mastery);
        this.spirit = spirit;
    }

    public Monk(String name) {
        super(name, 30, 30,   -4, -4, 12, 7, 5, 10, 10);
        this.spirit = 1;
    }

    @Override
    public String getInfo() {
        return "Я монах!";
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2 ) {
        super.step(b1, b2);
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
