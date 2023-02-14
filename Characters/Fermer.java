package org.example.Characters;

public class Fermer extends  BaseCharacter{
    int stamina;
    int loyalty;

    public Fermer(String name, int currentHealh, int maxHealh, int damage, int defence, int speed, int distancy, int stamina, int loyalty) {
        super(name, currentHealh, maxHealh, damage, defence, speed, distancy);
        this.stamina = stamina;
        this.loyalty = loyalty;
    }

    public void serve(){
        System.out.println("Прислуживаеть");
    }

    public void work(){
        System.out.println("Работает/ добывает что-то");
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getStamina() {
        return stamina;
    }

    public int getLoyalty() {
        return loyalty;
    }
}
