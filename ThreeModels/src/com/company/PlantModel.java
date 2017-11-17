package com.company;

public class PlantModel {
    String color;
    String name;
    boolean isThirsty;
    boolean isSucculent;
    boolean isLeafy;

    public PlantModel(String name, boolean isSucculent, boolean isLeafy) {
        this.color = "green";
        this.name = name;
        this.isThirsty = true;
        this.isSucculent = isSucculent;
        this.isLeafy = isLeafy;
    }

    //METHODS
    public void water() {
        this.isThirsty = false;
    }

    public void printInfo() {
        System.out.println("name: " + this.name + " color: " + this.color + " thirsty: " + this.isThirsty);
    }
}


