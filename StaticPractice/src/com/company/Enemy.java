package com.company;

public class Enemy {
    String name;
    String description;
    int strength;
    int craft;
    boolean isDead;
    static int numVanquished;

    //Constructor
    public Enemy (String name, String description, int strength, int craft) {
        this.name = name;
        this.description = description;
        this.strength = strength;
        this.craft = craft;
        this.isDead = false;
    }

    public void attackHeroStrength (int heroStrength, int heroLife) {
        if (this.strength > heroStrength) {
            System.out.println("The enemy strikes a crushing blow!");
            heroLife--;
        }
        else if (this.strength == heroStrength) {
            System.out.println("You are evenly matched! Try again!");
        }
        else if (this.strength < heroStrength) {
            System.out.println("The hero wins!");
            this.isDead = true;
            numVanquished++;
        }
        else return;
    }

    public void attackHeroCraft (int heroCraft, int heroLife) {
        if (this.craft > heroCraft) {
            System.out.println("The enemy sends a crippling blast of psychic energy!");
            heroLife--;
        }
        else if (this.craft == heroCraft) {
            System.out.println("You are evenly matched! Try again!");
        }
        else if (this.craft < heroCraft) {
            System.out.println("The hero wins!");
            this.isDead = true;
            numVanquished++;
        }
        else return;
    }

    public static int getNumVanquished() {
        return numVanquished;
    }


}
