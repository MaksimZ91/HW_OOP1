package org.example.Characters;

public class BaseCharacter {

    private String name;
    protected int currentHealh, maxHealh, damage, defence, speed, distancy;
    protected Object weapon, invetary, bufs;


    public BaseCharacter (String name, int currentHealh, int maxHealh,int damage, int defence, int speed, int distancy){
        this.name = name;
        this.currentHealh = currentHealh;
        this.maxHealh = maxHealh;
        this.damage = damage;
        this.defence = defence;
        this.speed = speed;
        this.distancy = distancy;
    }

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
    public int getCurrentHealh() {
        return currentHealh;
    }
    public int getMaxHealh() {
        return maxHealh;
    }
    public int getDamage() {
        return damage;
    }
    public int getDefence() {
        return defence;
    }
    public int getSpeed() {
        return speed;
    }
    public Object getWeapon() {
        return weapon;
    }
    public Object getInvetary() {
        return invetary;
    }
    public Object getBufs() {
        return bufs;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCurrentHealh(int currentHealh) {
        this.currentHealh = currentHealh;
    }
    public void setMaxHealh(int maxHealh) {
        this.maxHealh = maxHealh;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setDefence(int defence) {
        this.defence = defence;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setWeapon(Object weapon) {
        this.weapon = weapon;
    }
    public void setInvetary(Object invetary) {
        this.invetary = invetary;
    }
    public void setBufs(Object bufs) {
        this.bufs = bufs;
    }





}
