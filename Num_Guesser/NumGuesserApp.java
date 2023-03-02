/*
NumGuesserApp.java
Ken Sheridan
02/03/23
*/

//Number guesser game where the user has to try and correctly guess a randomly generated number between 1 & 10.
import java.util.*;
public class NumGuesserApp {
    public static void main(String[] args) {
        //declare vars
        int[] yourNumbers = new int[100];
        int numOfGuesses = 0;
        int randomNum;
        int userGuess;
        boolean turns = true;
        String playAgain = "";
        String result;
        //declare and create objects
        Scanner keyboard = new Scanner(System.in);
        NumGuesser game;
        game = new NumGuesser();
        //inputs
        while (turns) {
            randomNum = (int)(Math.random() * 10 + 1);
            System.out.println("\nPlease guess a whole number from 1 - 10");
            userGuess = keyboard.nextInt();
            yourNumbers[numOfGuesses] = userGuess;
            numOfGuesses++;
            //set
            game.setUserGuess(userGuess);
            game.setRandomNum(randomNum);
            //compute
            game.checkUserGuess();
            //get
            result = game.getResult();
            //output
            System.out.println("\nYou guessed "+ userGuess);
            System.out.println("\nThe number we were looking for was " + randomNum);
            System.out.println(result+"\n");
            if(userGuess == randomNum) {
                for (int i = 0; i < numOfGuesses; i++) {
                    System.out.print(yourNumbers[i]+ " ");
                } 
            }
            System.out.println("\nWould you like to play again? (y/n)");
            playAgain = keyboard.next();
            if (playAgain.equalsIgnoreCase("y")) {
                turns = true;
            } else {
                turns = false;
                System.out.println("Thanks for playing! You guessed these numbers... ");
                for (int i = 0; i < numOfGuesses; i++) {
                    System.out.print(yourNumbers[i] + " ");
                } 
            }
            
        }
        keyboard.close();
    }
}