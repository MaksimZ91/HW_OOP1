package org.example.Characters;

import java.util.ArrayList;

public class Fermer extends  MeleCharacter{

    int deliv;

    public Fermer(String name, int currentHealh, int maxHealh, int midDamage, int maxDamage, int attac, int defence, int speed, int distancy, int agility, int stamina, int loyalty) {
        super(name, currentHealh, maxHealh, midDamage, maxDamage, attac, defence, speed, distancy, agility, stamina);
        this.deliv = loyalty;
    }

    public Fermer(String name) {
        super(name, 1,1,1,1,1,1,3,10,10,10);
        this.deliv = 1;
    }

    @Override
    public String getInfo() {
        return "Я фермер!";
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2 ) {
        super.step(b1, b2);
    }

    public void serve(){
        System.out.println("Прислуживаеть");
    }

    public void work(){
        System.out.println("Работает/ добывает что-то");
    }

    public int getLoyalty() {
        return deliv;
    }

    public void setLoyalty(int loyalty) {
        this.deliv = loyalty;
    }

}

