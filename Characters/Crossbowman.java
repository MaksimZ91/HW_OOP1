package org.example.Characters;

public class Crossbowman extends RangeCharacter{
    int energy;

    public Crossbowman(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int accuracy, int shots, int maxShots, int energy) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy, accuracy, shots, maxShots);
        this.energy = energy;
    }

    public Crossbowman(String name) {
        super(name, 100, 120, 40,32,40,6,15,22,25);
        this.energy = 10;
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }

    @Override
    public void step() {
        super.step();
    }

    public  void collectBolts(){
        System.out.println("Собирать болты");
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}


