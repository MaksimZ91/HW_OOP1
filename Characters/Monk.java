package org.example.Characters;
import java.util.ArrayList;

public class Monk extends MagikCharacter{
    int spirit;

    public Monk(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy,  int xCoord, int yCoord, int spirit) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy,  xCoord, yCoord);
        this.spirit = spirit;
    }

    public Monk(String name, int xCoord, int yCoord) {
        super(name, 30, 30,   -4, -4, 12, 7, 5, 10,  xCoord, yCoord);
        this.spirit = 1;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attac)
                .append("\t| HP:\t").append(Monk.super.currentHealh)
                .append(" \t| MP:\t").append(Monk.super.magik)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coords.getxCords()).append(".").append(Monk.super.coords.getyCords());
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2 ) {
        super.step(b1, b2);
    }


}
