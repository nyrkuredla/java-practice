package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece redGamePiece = new GamePiece("hat", "red");
        redGamePiece.move(2, 3);
        System.out.println(redGamePiece.positionX); // 2
        redGamePiece.freeze();
        System.out.println(redGamePiece.isFrozen); //true
        redGamePiece.move(4, 5);
        System.out.println(redGamePiece.positionX); // still 2 because it will not move when frozen
        redGamePiece.unfreeze();
        System.out.println(redGamePiece.isFrozen); //false

    }
}
//
//Assignment (from The Iron Yard Newline Java course)
//        Model a game piece:
//
//        In the src directory create a GamePiece Java class
//Add the following required instance variables
//        int positionX
//        int positionY
//        boolean frozen
//        Add a couple String instance variables (e.g. name, color)
//        Add an empty constructor (no parameters). (IntelliJ can generate these for you)
//        In the constructor set the position variables to zero and frozen to false.
//        Add get methods only for the "position" and "frozen" variables (IntelliJ can generate these for you)
//        Add get and set methods for the other variables (IntelliJ can generate these for you)
//        Add some behavior to the game piece:
//
//        Add a move() method (returns void) that takes a new x and y position. Set the instance variables to the parameters.
//        Add a freeze() method (returns void) and set frozen to true
//        Add a unfreeze() method (returns void) and set frozen to false
//        Change move() so that that when frozen the piece does not move
//        Test the freeze, unfreeze and move methods in the public static void main(String[] args) method of Main.java.
//
//        Create a GamePiece object.
//        Only call the methods on the object, do not access the instance variables directly.
//        Verify that if the game piece is not frozen then the call to freeze sets the frozen varable to true.
//        Verify that if the game piece is frozen then the call to unfreeze sets the frozen varable to false.
//        Verify that if the game piece is not frozen then the call to move results in the new position.
//        Verify that if the game piece is frozen then the call to move does not change the position.