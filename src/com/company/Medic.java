package com.company;

public class Medic extends Hero {
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType+"ому Медику отлично, он придумал лекарство от коронавируса");
    }
}