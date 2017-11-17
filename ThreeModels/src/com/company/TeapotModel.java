package com.company;

public class TeapotModel {
    String material;
    String name;
    boolean isFull;
    boolean isHot;

    //CONSTRUCTOR
    public TeapotModel(String material, String name) {
        this.material = material;
        this.name = name;
        this.isFull = false;
        this.isHot = false;
    }

    //METHODS
    public void fillTeapot() {
        this.isFull = true;
    }

    public void putKettleOn() {
        this.isHot = true;
    }

    public void pourTea() {
        this.isFull = false;
        this.isHot = false;
    }

    public void printInfo() {
        System.out.println("Teapot name: " + this.name + ", material: " + this.material + ", hot: " + this.isHot + ", full: " + this.isFull);
    }


}


