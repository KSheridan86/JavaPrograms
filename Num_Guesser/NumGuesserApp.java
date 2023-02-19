/*
NumGuesserApp.java
Ken Sheridan
10/02/23
*/

//Number guesser game where the user has to try and correctly guess a randomly generated number between 1 & 10.
import java.util.*;
public class NumGuesserApp {
    public static void main(String[] args) {
        //declare vars
        int randomNum;
        randomNum = (int)(Math.random() * 10 + 1);
        int userGuess;
        String result;
        //declare and create objects
        Scanner keyboard = new Scanner(System.in);
        NumGuesser game;
        game = new NumGuesser();
        //inputs
        System.out.println("Please guess a whole number from 1 - 10");
        userGuess = keyboard.nextInt();
        keyboard.close();
        //set
        game.setUserGuess(userGuess);
        game.setRandomNum(randomNum);
        //compute
        game.checkUserGuess();
        //get
        result = game.getResult();
        //output
        System.out.println("The number we were looking for was "+randomNum);
        System.out.println(result);
    }
}
