package org.example.Characters;

import java.util.ArrayList;

public class Fermer extends  MeleCharacter{

    int deliv;

    public Fermer(String name, int currentHealh, int maxHealh, int midDamage, int maxDamage, int attac, int defence, int speed, int distancy, int agility, int stamina, int xCoord, int yCoord, int deliv) {
        super(name, currentHealh, maxHealh, midDamage, maxDamage, attac, defence, speed, distancy, agility, stamina, xCoord, yCoord);
        this.deliv = deliv;
    }

    public Fermer(String name, int xCoord, int yCoord) {
        super(name, 1,1,1,1,1,1,3,10,10,10, xCoord, yCoord) ;
        this.deliv = 1;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Fermer.super.name)
                .append("\t| ATK:\t").append(Fermer.super.attac)
                .append("\t| HP:\t").append(Fermer.super.currentHealh)
                .append("\t|").append("\t| (X.Y) : ").append(Fermer.super.coords.getxCords()).append(".").append(Fermer.super.coords.getxCords());
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2 ) {
        if (!this.state.equals("Die")) this.state = "Stand";
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

