package org.example.Characters;

public class Crossbowman extends BaseCharacter {
    int bolths;
    int energy;
    int accuracy;
    public Crossbowman(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int bolths, int energy, int accuracy) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy);
        this.bolths = bolths;
        this.energy = energy;
        this.accuracy = accuracy;
    }

    public  void reload(){
        System.out.println("Перезарядка");
    }

    public  void collectBolts(){
        System.out.println("Собирать болты");
    }

    public  void cloaking(){
        System.out.println("Маскировка");
    }

    public int getBolths() {
        return bolths;
    }

    public void setBolths(int bolths) {
        this.bolths = bolths;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
