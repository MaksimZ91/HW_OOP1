package org.example.Characters;

public abstract  class RangeCharacter extends BaseCharacter {

    int accuracy, shots, maxShots;
    public RangeCharacter(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int accuracy, int shots, int maxShots) {
        super(currentHealh, maxHealh, damage, defence, speed, distancy);
        super.name = name;
        this.accuracy = accuracy;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    @Override
    public String getInfo() {
        return "Я боец дальнего боя!";
    }

    @Override
    public void step() {
        super.step();
    }

    public  void reload(){
        System.out.println("Перезарядка");
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getMaxShots() {
        return maxShots;
    }

    public void setMaxShots(int maxShots) {
        this.maxShots = maxShots;
    }
}
