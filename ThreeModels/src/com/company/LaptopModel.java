package com.company;

public class LaptopModel {
    private String color;
    private String name;
    private String brand;
    private boolean isOn;
    private int ram;
    private int memory;

    //CONSTRUCTOR
    public LaptopModel(String color, String name, String brand, int ram, int memory) {
        this.color = color;
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.memory = memory;
        this.isOn = false;
    }

    //GETTERS AND SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    //METHODS

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void printInfo() {
        System.out.println("name: " + this.name + " color: " + this.color + " on: " + this.isOn + " memory: " + this.memory + " ram: " + this.ram + " brand: " + this.brand);
    }

}
