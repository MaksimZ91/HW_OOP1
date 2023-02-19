package org.example.Characters;

import java.util.ArrayList;

public abstract class BaseCharacter implements GameInterface {

    protected String name;
    protected int currentHealh, maxHealh, minDamage, maxDamage, attac, defence, speed, distancy;
    protected Object weapon, invetary, bufs;

    public BaseCharacter(String name, int currentHealh, int maxHealh, int minDamage, int maxDamage, int attac, int defence, int speed, int distancy) {
        this.name = name;
        this.currentHealh = currentHealh;
        this.maxHealh = maxHealh;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attac = attac;
        this.defence = defence;
        this.speed = speed;
        this.distancy = distancy;
    }



    @Override
    public String getInfo() {
            return "Я базовый персонаж!";
    }

    @Override
    public void step(ArrayList<BaseCharacter> b1, ArrayList <BaseCharacter> b2) { }

    public void attack (Object weapon){
        //базовый урон + урон от оружия
        System.out.printf("Атака %s \n", weapon);
    }
    public void heal (){
        //Лечение
        System.out.printf("Лечение");
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

    public int getMidDamage() {
        return minDamage;
    }

    public void setMidDamage(int minDamage) {
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


}
