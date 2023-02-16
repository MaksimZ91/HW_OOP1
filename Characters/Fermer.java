package org.example.Characters;

public class Fermer extends  MeleCharacter{

    int loyalty;

    public Fermer(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int stamina, int agility, int loyalty) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy, stamina, agility);
        this.loyalty = loyalty;
    }

    public Fermer(String name) {
        super(name, 80, 100, 12, 20, 40, 1, 12, 10);
        this.loyalty = 10;
    }

    @Override
    public String getInfo() {
        return "Я фермер!";
    }

    @Override
    public void step() {
        super.step();
    }

    public void serve(){
        System.out.println("Прислуживаеть");
    }

    public void work(){
        System.out.println("Работает/ добывает что-то");
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

}

