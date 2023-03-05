package org.example.Characters;

import java.util.ArrayList;

public abstract  class RangeCharacter extends BaseCharacter {

    int accuracy, shots, maxShots;

    public RangeCharacter(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int accuracy, int shots, int maxShots, int xCoord, int yCoord) {
        super(name, currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy, xCoord, yCoord);
        this.accuracy = accuracy;
        this.shots = shots;
        this.maxShots = maxShots;
    }



    @Override
    public void step(ArrayList<BaseCharacter> frends, ArrayList <BaseCharacter> teamEnemy ) {
        if (state.equals("Die") || this.shots <= 0) return;
        BaseCharacter enemy = teamEnemy.get(findeNearest(teamEnemy));
        float damage = (enemy.defence - attac > 0) ? minDamage: (enemy.defence - attac < 0)? maxDamage : (maxDamage + minDamage)/2;
      //  enemy.getDamage(damage);
        for (BaseCharacter hero: frends) {
            if(hero.getInfo().toString().split(":").equals("Фермер") && hero.state.equals("Stand")){
                hero.state = "Busy";
                return;
            }
        }
        this.shots--;
    }


}
