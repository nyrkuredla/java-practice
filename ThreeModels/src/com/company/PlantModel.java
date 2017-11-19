package com.company;

public class PlantModel {
    private String color;
    private String name;
    private boolean isThirsty;
    private boolean isSucculent;
    private boolean isLeafy;
    static int numPlants;

    public PlantModel(String name, boolean isSucculent, boolean isLeafy) {
        this.color = "green";
        this.name = name;
        this.isThirsty = true;
        this.isSucculent = isSucculent;
        this.isLeafy = isLeafy;
        numPlants ++;
    }

    //METHODS
    public void water() {
        this.isThirsty = false;
    }

    public void printInfo() {
        System.out.println("name: " + this.name + " color: " + this.color + " thirsty: " + this.isThirsty);
    }

}




