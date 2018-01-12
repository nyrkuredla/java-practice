package com.rtkelley;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calculateScore("Mark",1000);
        calculateScore(300);
        calculateScore();
    }

    public static int calculateScore(String playerName, int playerScore) {
        System.out.println("Captain " + playerName + " scored " + playerScore + " in this round!");
        int bonusScore = playerScore / 10;
        System.out.println("Bonus: " + bonusScore);
        return bonusScore;
    }

    // method overloading: same method name, but different number of arguments
    // this means that we can use the same method name to pass both name and score, or just score, or nothing, and it will still run!
    public static int calculateScore(int playerScore) {
        System.out.println("Captain Anonymous scored " + playerScore + " in this round!");
        int bonusScore = playerScore / 10;
        System.out.println("Bonus: " + bonusScore);
        return bonusScore;
    }

    public static void calculateScore() {
        System.out.println("Nobody played, nothing happened :(");
    }
}
