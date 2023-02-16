package org.example.Characters;

public abstract class BaseCharacter implements GameInterface {

    protected String name;
    protected int currentHealh, maxHealh, damage, defence, speed, distancy;
    protected Object weapon, invetary, bufs;


    public BaseCharacter (int currentHealh, int maxHealh,int damage, int defence, int speed, int distancy){
        this.currentHealh = currentHealh;
        this.maxHealh = maxHealh;
        this.damage = damage;
        this.defence = defence;
        this.speed = speed;
        this.distancy = distancy;
    }

    @Override
    public String getInfo() {
            return "Я базовый персонаж!";
    }

    @Override
    public void step() { }

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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

    public Object getWeapon() {
        return weapon;
    }

    public void setWeapon(Object weapon) {
        this.weapon = weapon;
    }

    public Object getInvetary() {
        return invetary;
    }

    public void setInvetary(Object invetary) {
        this.invetary = invetary;
    }

    public Object getBufs() {
        return bufs;
    }

    public void setBufs(Object bufs) {
        this.bufs = bufs;
    }
}
