package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int correctNumber = 59;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 100.");
        Integer userGuess = Integer.valueOf(scanner.nextLine());
        if (userGuess < correctNumber) {
            System.out.println("Too low. Sorry.");
        } else if (userGuess > correctNumber) {
            System.out.println("Nope, sorry, too high.");
        } else if (userGuess == correctNumber) {
            System.out.println("Whoa, you guessed it!");
        }

    }
}