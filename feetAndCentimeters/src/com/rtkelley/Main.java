package com.rtkelley;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double feet = 0;
        double inches = 1;
        System.out.println("Inches: " + inches);
        System.out.println("Feet: " + feet);
        System.out.println("Centimeters: " + calcCentimeters(feet, inches));
        System.out.println("");

        feet = 1;
        inches = 0;
        System.out.println("Inches: " + inches);
        System.out.println("Feet: " + feet);
        System.out.println("Centimeters: " + calcCentimeters(feet, inches));
        System.out.println("");

        inches = 11;
        System.out.println("Inches: " + inches);
        System.out.println("Centimeters: " + calcCentimeters(inches));
    }

    public static double calcCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Enter in a number of feet and inches. Inches must be between 0 and 12. Feet must be equal to or more than 0.");
            return -1;
        }
        else {
            inches += (feet * 12);
            return inches * 2.54;
        }
    }

    public static double calcCentimeters(double inches) {
        if ((inches < 0) || (inches > 12)) {
            System.out.println("Enter in a number of inches between 0 and 12.");
            return -1;
        }
        else {
            return inches * 2.54;
        }
    }
}
