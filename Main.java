package org.example;

import org.example.Characters.*;

public class Main {
    public static void main(String[] args) {
        Crossbowman crossbowman = new Crossbowman("A", 1,2,3,4,5,6,7,8,9);
        Fermer fermer = new Fermer("B", 1,2,3,4,5,6,7,8);
        Mage mage = new Mage("C", 1,2,3,4,5,6,7,8);
        Monk monk = new Monk("D", 1,2,3,4,5,6,7,8);
        Rouge rouge = new Rouge("E", 1,2,3,4,5,6,7,8, 9);
        Sniper sniper = new Sniper("F", 1,2,3,4,5,6,7,8, 9);
        SpearMan spearMan = new SpearMan("G", 1,2,3,4,5,6,7,8);

    }
}