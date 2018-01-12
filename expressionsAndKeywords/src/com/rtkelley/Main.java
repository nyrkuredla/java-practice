package com.rtkelley;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String playerName = "Sally";
        int playerScore = 1500;
        int playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, playerPosition);
        playerScore = 900;
        playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, playerPosition);
        playerScore = 400;
        playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, playerPosition);
        playerScore = 50;
        playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, playerPosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println("Well done, captain " + playerName + ". You have achieved " + playerPosition + " place.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore > 500) {
            return 2;
        }
        else if (playerScore > 100) {
            return 3;
        }
        else if (playerScore < 100) {
            return 4;
        }
        else return 5;
    }
}
