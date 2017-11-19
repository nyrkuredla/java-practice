package com.company;

public class Cactus extends PlantModel {
    boolean isSpiky;

    public Cactus(String name, boolean isSucculent, boolean isLeafy) {
        super(name, isSucculent, isLeafy);
        this.isSpiky = true;
    }

}
