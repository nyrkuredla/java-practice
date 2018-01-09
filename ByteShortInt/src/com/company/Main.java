package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // you can use underscores to make large numbers more readable
    int myMinValue = -2_147_483_648; // add another digit and you'll get an error
    int myMaxValue = 2_147_483_647; // make the last digit an 8 and you'll get an error

    byte myByteValue = -128; // range: -128 to 127
    //byte myNewByte = myByteValue / 2; nope! hover over and you'll see that this number is an int type
    byte myReallyNewByte = (byte)(myByteValue / 2); //no error; Java "casts" this into a byte type with the (byte) addition

        System.out.println("myreallyNewByte value: " + myReallyNewByte); //runs


    short myShortValue = 32767;

    }
}
