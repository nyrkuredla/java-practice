package com.company;

public class GamePiece {


    int positionX;
    int positionY;
    boolean isFrozen;
    String name;
    String color;

    //constructor; positions and isFrozen are specified in exercise instructions from Newline; see Main
    public GamePiece(String name, String color) {
        this.positionX = 0;
        this.positionY = 0;
        this.isFrozen = false;
        this.name = name;
        this.color = color;
    }

    //GETTERS FOR POSITIONS AND ISFROZEN
    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public String getName() {
        return name;
    }
    //end getters

    //GETTERS AND SETTERS FOR NAME AND COLOR
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //end getters and setters

    //METHODS
    public void move(int x, int y) {
        if (this.isFrozen == true) {
            return;
        }
        else {
            this.positionX = x;
            this.positionY = y;
        }
    }

    public void freeze(){
        this.isFrozen = true;
    }

    public void unfreeze(){
        this.isFrozen = false;
    }



}
