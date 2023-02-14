package org.example.Characters;

public class SpearMan extends BaseCharacter{
    int strange;
    int spear;

    public SpearMan(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int strange, int spear) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy);
        this.strange = strange;
        this.spear = spear;
    }

    public void fear(){
        System.out.println("Наводит ужас");
    }
    public void  taunt(){
        System.out.println("Провоцирует");
    }
    public void throwSpear (){
        System.out.println("Метает копье");
    }
    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public int getSpear() {
        return spear;
    }

    public void setSpear(int spear) {
        this.spear = spear;
    }
}
