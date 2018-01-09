package com.company;

public class Main {

    public static void main(String[] args) {
    // floats and doubles

    int myIntValue = 5;
    float myFloatValue = 5f; // convention to add "f" after floats
    double myDoubleValue = 5d; // ditto for "d". if you add decimal points after an int, Java will assume a double
    //so: myNewFloat = 5.25;  // errors out because of this
    float myNewFloat = (float) 5.25; // ok due to casting
    System.out.println("myIntValue: " + myIntValue);
    System.out.println("myFloatValue: " + myFloatValue);
    System.out.println("myDoubleValue: " + myDoubleValue);

    int myDivInt = 5/2;
    System.out.println("myDivInt: " + myDivInt); // 2, because that's the whole quotient, no remainders
    float myDivFloat = 1.0f/3.0f;
    System.out.println("myDivFloat: " + myDivFloat); // 0.33333334, 8 decimal digits
    double myDivDouble = 1.0d/3.0d;
    System.out.println("myDivDouble: " + myDivDouble); // 0.3333333333333333, 16 decimal digits


    //challenge: convert pounds to kilos
    double numPounds = 2d;
    double numKilos = (numPounds * 0.4535937);
    System.out.println("Pounds: " + numPounds);
    System.out.println("Kilos: " + numKilos);
    }
}
