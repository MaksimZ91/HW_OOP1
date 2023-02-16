package org.example;
import org.example.Characters.*;

import java.util.ArrayList;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        ArrayList<BaseCharacter> heroList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            heroList.add(getHero());
        }

        heroList.forEach( hero -> System.out.println(hero.getInfo()));

    }

    private static String getName(){
        Random rnd = new Random();
        return String.valueOf(HeroName.values()[rnd.nextInt(HeroName.values().length-1)]);
    }

    private static BaseCharacter getHero(){    //Итересная реализация switch - case
        Random rnd = new Random();
        return switch (rnd.nextInt(7)) {
            case 1 -> new SpearMan(getName());
            case 2 -> new Rouge(getName());
            case 3 -> new Mage(getName());
            case 4 -> new Sniper(getName());
            case 5 -> new Crossbowman(getName());
            case 6 -> new Monk(getName());
            default -> new Fermer(getName());
        };
    }

}