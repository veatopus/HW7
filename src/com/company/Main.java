package com.company;
public class Main{

    public static void main(String[] args) {
        HavingSuperAbility[] arrayHero = {new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < arrayHero.length; i++) {
            arrayHero[i].applySuperAbility("Больш");
        }
    }
}