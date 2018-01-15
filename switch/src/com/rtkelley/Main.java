package com.rtkelley;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //switch statements are basically equivalent to if/else if/else in terms of function
        int switchValue = 5;

        switch(switchValue) {
            case 1: //if switchValue is 1
                System.out.println("it's 1");
                break;
            case 2:
                System.out.println("it's 2");
                break;
            case 3:case 4:case 5: // can group multiple tests together
                System.out.println("it was 3, 4, or 5");
                break; //make sure to include the breaks every time. else the default code will run as well, along with anything else that wasn't "breaked"
            default: // else
                System.out.println("it's something else");
                break;
        }
        char switchChar = 'b';

        switch(switchChar) {
            case 'a':
                System.out.println("it's a");
                break;
            case 'b':
                System.out.println("it's b");
                break;
            case 'c':
                System.out.println("it's c");
                break;
            case 'd':
                System.out.println("it's d");
                break;
            case 'e':
                System.out.println("it's e");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
    // switch statements are a bit more rigid than if statements because they can only test the same variable as is passed in.
    // contrast with if statements. you can introduce another condition into e.g. the "else if" statement.
}
