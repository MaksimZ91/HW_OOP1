package org.example;
import org.example.Characters.*;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        ArrayList<BaseCharacter> team1 = new ArrayList<>();
        ArrayList<BaseCharacter> team2 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            ArrayList<String> list = getTeamHero();
            team1.add(getHero(list.get(0),1, i+1));
            team2.add(getHero(list.get(1), 10, i+1));
        }
        ArrayList<BaseCharacter> heroList = new ArrayList<>(team1);
        heroList.addAll(team2);

        System.out.println("Команда 1");
        team1.forEach( hero -> System.out.printf("Команда 1,Имя: %s,  %s, health: %d , координаты X: %d, Y: %d \n" ,hero.getName(), hero.getInfo(), hero.getCurrentHealh(), hero.getXCoords(), hero.getYCoords()));
        System.out.println("Команда 2");
        team2.forEach( hero -> System.out.printf("Команда 2,Имя: %s,  %s, health: %d,  координаты X: %d, Y: %d  \n" ,hero.getName(), hero.getInfo(), hero.getCurrentHealh(), hero.getXCoords(), hero.getYCoords()));


        heroList.sort(new Comparator<BaseCharacter>() {
            @Override
            public int compare(BaseCharacter o1, BaseCharacter o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });

        System.out.println("Общий список отсортированный по скорости: ");
        for(BaseCharacter Character : heroList){
            if (team1.contains(Character)){
                System.out.printf("Команда 1,Имя: %s,  %s, health: %d, x: %d, y: %d \n" ,Character.getName(), Character.getInfo(), Character.getCurrentHealh(), Character.getXCoords(), Character.getYCoords() );
                Character.step(team1, team2);
            }else{
                System.out.printf("Команда 2,Имя: %s,  %s, health: %d, x: %d, y: %d \n" ,Character.getName(), Character.getInfo(), Character.getCurrentHealh(), Character.getXCoords(), Character.getYCoords());
                Character.step(team2, team1);
            }
        }


    }

    private static String getName(){
        Random rnd = new Random();
        return String.valueOf(HeroName.values()[rnd.nextInt(HeroName.values().length)]);
    }

    private static ArrayList<String> getTeamHero(){
        ArrayList<String> ls = new ArrayList<>();
        Random rnd = new Random();
        ls.add(String.valueOf(Team1.values()[rnd.nextInt(Team1.values().length)]));
        ls.add(String.valueOf(Team2.values()[rnd.nextInt(Team2.values().length)]));
        return ls;
    }

    private static BaseCharacter getHero(String hero,int xCoord,int yCoord){
        return switch (hero) {
            case "SpearMan" -> new SpearMan(getName(),xCoord, yCoord);
            case "Rouge" -> new Rouge(getName(),xCoord, yCoord);
            case "Mage" -> new Mage(getName(),xCoord, yCoord);
            case "Sniper" -> new Sniper(getName(),xCoord, yCoord);
            case "Crossbowman" -> new Crossbowman(getName(),xCoord, yCoord);
            case "Monk" -> new Monk(getName(),xCoord, yCoord);
            default -> new Fermer(getName(),xCoord, yCoord);
        };
    }

}