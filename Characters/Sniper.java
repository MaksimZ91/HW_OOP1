package org.example.Characters;

public class Sniper extends  RangeCharacter{
    int stealth;


    public Sniper(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int accuracy, int shots, int maxShots, int stealth) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy, accuracy, shots, maxShots);
        this.stealth = stealth;
    }

    public Sniper(String name) {
        super(name, 100, 120, 60, 32, 40, 5, 10, 15, 15);
        this.stealth = 5;
    }

    public  void cloaking(){
        System.out.println("Маскировка");
    }

    @Override
    public String getInfo() {
        return "Я снайпер!";
    }

    @Override
    public void step() {
        super.step();
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }
}
