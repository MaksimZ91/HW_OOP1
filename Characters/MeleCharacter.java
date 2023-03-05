package org.example.Characters;

import org.example.Vector2D;

import java.util.ArrayList;

public abstract class MeleCharacter extends BaseCharacter {
    int  agility, stamina;

    public MeleCharacter(String name, int currentHealh, int maxHealh, int midDamage, int maxDamage, int attac, int defence, int speed, int distancy, int agility, int stamina, int xCoord, int yCoord) {
        super(name, currentHealh, maxHealh, midDamage, maxDamage, attac, defence, speed, distancy, xCoord, yCoord);
        this.agility = agility;
        this.stamina = stamina;
    }



    @Override
    public void step(ArrayList<BaseCharacter> teamFrends, ArrayList <BaseCharacter> teamEnemy ) {
        if(state.equals("Die")) return;
        BaseCharacter enemy = teamEnemy.get(findeNearest(teamEnemy));
        if(coords.distanceCalculation(coords, enemy.coords) < 2){
           float damage = (enemy.defence - attac > 0) ? minDamage: (enemy.defence - attac < 0)? maxDamage : (maxDamage + minDamage)/2;
            enemy.getDamage(damage);//
        }
        switch (movement(enemy.coords, teamFrends)) {
            case "Up" -> coords.setXcords(getXCoords() - 1);
            case "Down" -> coords.setXcords(getXCoords() + 1);
            case "Left" -> coords.setyCords(getYCoords() - 1);
            case "Right" -> coords.setyCords(getYCoords() + 1);

        }
    }

    private String movement(Vector2D enemy, ArrayList<BaseCharacter> teamFrends){
        if (coords.getxCords() > enemy.getxCords() && coords.getyCords() > enemy.getyCords() && isEmpty(coords.getxCords(),coords.getyCords() + 1, teamFrends)) return "Right";
        else if (coords.getxCords() < enemy.getxCords() && coords.getyCords() < enemy.getyCords() && isEmpty(coords.getxCords() ,coords.getyCords() - 1, teamFrends)) return "Left";
        else if (coords.getxCords() > enemy.getxCords() && isEmpty(coords.getxCords() + 1,coords.getyCords(), teamFrends)) return "Up";
        else if (coords.getxCords() < enemy.getxCords() && isEmpty(coords.getxCords() - 1,coords.getyCords(), teamFrends)) return "Down";


        return "Back";
    }

    private boolean isEmpty(int x, int y, ArrayList<BaseCharacter> teamFrends){
        boolean flag = true;
        for(BaseCharacter h : teamFrends){
            if(x == h.getXCoords() && y == h.getYCoords()) flag = false;
        }
        return flag ;
    }








}





