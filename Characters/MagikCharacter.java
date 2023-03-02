package org.example.Characters;
import java.util.ArrayList;


public abstract class MagikCharacter extends BaseCharacter {

    int magik;

    public MagikCharacter(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int xCoord, int yCoord) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy, xCoord, yCoord);
        this.magik = 1;
    }



    @Override
    public void step(ArrayList<BaseCharacter> frends, ArrayList <BaseCharacter> enemyTeam ) {
        if (this.state.equals("Die")) return;
        this.magik = 1;
        for (BaseCharacter hero: frends) {
            if(!hero.state.equals("Die") && hero.currentHealh < hero.maxHealh){
                if (this.magik <= 0) return;               ;
                hero.getHeal(maxDamage);
                this.magik --;
            }
        }
    }

}
