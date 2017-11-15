package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hi there! Give me a number, please.");
        Scanner scanner = new Scanner(System.in);
        String firstNum = scanner.nextLine();
        System.out.println("Thanks! One more number, if you'd be so good.");
        String secondNum = scanner.nextLine();
        double operand1 = Double.parseDouble(firstNum);
        double operand2 = Double.parseDouble(secondNum);
        System.out.println("Hooray! Your numbers are " + firstNum + " and " + secondNum);
        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

        System.out.println(showResults(sum, difference, division, multiplication, remainder));
    }

    public static String showResults(double sum, double difference, double division, double multiplication, double remainder) {
        return "Thanks. The sum of your numbers is " + Double.toString(sum) + ", the difference is " + Double.toString(difference) + ", the quotient is " + Double.toString(division) + ", the product is " + Double.toString(multiplication) + ", and the remainder is " + Double.toString(remainder);
    }
}

//Assignment
//        In the main method of Main.java class:
//
//        Ask the user to input two numbers
//        Get the numbers as Strings using Scanner
//        Convert a String to a double using Double.parseDouble. Save the the first double value in an operand1 variable and the second double value in an operand2 variable
//        Add the operands and save in a sum variable
//        Subtract the operands and save in a difference variable
//        Divide the operands and save in a division variable
//        Multiple the operands and save in a multiplication variable
//        Find the remainder when one operand is divided by the other and save in a remainder variable. See this page if you need to learn more about the remainder operator.
//        Call a showResults method and pass the sum, difference, division, multiplication and remainder variables as arguments.
//        In the showResults method output the parameters with some meaningful text (e.g. The sum is 10.5).
