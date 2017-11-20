package com.company;

public class Hero {
    String name;
    int strength;
    int craft;
    int carry;
    static int numVanquished;

    public Hero (String name) {
        this.name = name;
        this.strength = 5;
        this.craft = 5;
        this.carry = 2;
    }

    public void printStats() {
        System.out.println("Strength: " + this.strength);
        System.out.println("Craft: " + this.craft);
        System.out.println("Enemies vanquished: " + numVanquished);
    }
}
