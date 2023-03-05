package org.example;
import org.example.Characters.*;
import java.util.*;


public class
Main {
    public static  ArrayList<BaseCharacter> team1 = new ArrayList<>();
    public static ArrayList<BaseCharacter> team2 = new ArrayList<>();
    public static ArrayList<BaseCharacter> heroList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();

        for (int i = 0; i < 10; i++) {
            ArrayList<String> list = getTeamHero();
            team1.add(getHero(list.get(0),1, i+1));
            team2.add(getHero(list.get(1), 10, i+1));
        }
        heroList.addAll(team1);
        heroList.addAll(team2);

        heroList.sort(new Comparator<BaseCharacter>() {
            @Override
            public int compare(BaseCharacter o1, BaseCharacter o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });


        while (true){
            View.view();
            user_input.nextLine();
            for(BaseCharacter Character : heroList){
                if (team1.contains(Character)){
                    Character.step(team1, team2);
                }else{
                    Character.step(team2, team1);
                }
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