package org.example.Characters;

public class Sniper extends  BaseCharacter{
    int bullets;
    int accuracy;
    int stealth;

    public Sniper(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int bullets, int accuracy, int stealth) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy);
        this.bullets = bullets;
        this.accuracy = accuracy;
        this.stealth = stealth;
    }

    public  void reload(){
        System.out.println("Перезарядка");
    }
    public  void cloaking(){
        System.out.println("Маскировка");
    }
    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getBullets() {
        return bullets;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getStealth() {
        return stealth;
    }
}
