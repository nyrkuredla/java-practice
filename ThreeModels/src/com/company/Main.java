package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    TeapotModel glassTeapot = new TeapotModel("glass", "Franny");
    TeapotModel bigTeapot = new TeapotModel("ceramic", "Bub");
    PlantModel tallPlant = new PlantModel("Floof", false, true);
    LaptopModel ryanLaptop = new LaptopModel("silver", "Macbook Pro", "Apple", 16, 500);
    Cactus cuteCactus = new Cactus("Chris", true, false);

    System.out.println("Is the " + glassTeapot.material + " teapot full?: " + glassTeapot.isFull);
    glassTeapot.fillTeapot();
    System.out.println("How about now?: " + glassTeapot.isFull);

    glassTeapot.printInfo();
    bigTeapot.printInfo();
    tallPlant.printInfo();
    ryanLaptop.printInfo();
    cuteCactus.printInfo();
    cuteCactus.water();
    cuteCactus.printInfo();

    }
}
