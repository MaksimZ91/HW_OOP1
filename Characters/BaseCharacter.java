package org.example.Characters;

import org.example.Vector2D;

import java.util.ArrayList;

public abstract class BaseCharacter implements GameInterface {

    protected String name;
    protected int currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy;
    protected Vector2D coords;
    protected String state;


    public BaseCharacter(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy, int xCoord, int yCoord) {
        this.name = name;
        this.currentHealh = currentHealh;
        this.maxHealh = maxHealh;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attac = attac;
        this.defence = defence;
        this.speed = speed;
        this.distancy = distancy;
        this.coords = new Vector2D(xCoord, yCoord);
        this.state = "Stand";
    }



    @Override
    public String getInfo() {
            return "Я базовый персонаж!";
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2) { }

    public int findeNearest(ArrayList <BaseCharacter> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++){
            if(min > this.coords.distanceCalculation(this.coords, team.get(i).coords) & !team.get(i).state.equals("Die")){
                min = this.coords.distanceCalculation(this.coords, team.get(i).coords);
                index = i;
            }
        }
        return index;
    }



    public void getDamage (float damage){
        this.currentHealh -= damage;
        if (this.currentHealh > this.maxHealh) this.currentHealh = maxHealh;
        if (this.currentHealh <= 0) this.state = "Die";
    }

    public void getHeal (float heal){
        this.currentHealh -= heal;
        if (this.currentHealh > this.maxHealh) this.currentHealh = maxHealh;
    }
    public void go (int speed){
        System.out.println("Идем пешком");
    }
    public void run (int speed){
        System.out.println("Бежим");
    }
    public  void useItem(Object invetary){
        System.out.println("Использовать предмет из инветоря (зелья)");
    }



    //----------------------------------------------------------------------------------------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealh() {
        return currentHealh;
    }

    public void setCurrentHealh(int currentHealh) {
        this.currentHealh = currentHealh;
    }

    public int getMaxHealh() {
        return maxHealh;
    }

    public void setMaxHealh(int maxHealh) {
        this.maxHealh = maxHealh;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getAttac() {
        return attac;
    }

    public void setAttac(int attac) {
        this.attac = attac;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistancy() {
        return distancy;
    }

    public void setDistancy(int distancy) {
        this.distancy = distancy;
    }

    public int getXCoords() {
        return coords.getxCords();
    }

    public int getYCoords() {
        return coords.getyCords();
    }
    public void setXCoords(int X) {
        this.coords.setXcords(X);
    }

    public void setYCoords(int Y) {
        this.coords.setyCords(Y);
    }


}
