/*
NumGuesserApp.java
Ken Sheridan
25/02/23
*/

//Number guesser game where the user has to try and correctly guess a randomly generated number between 1 & 10.
import java.util.*;
public class DirtyHarryNumGuesserApp {
    public static void main(String[] args) {
        //declare vars
        int randomNum;
        int userGuess;
        int turns = 3;
        String result;
        //declare and create objects
        Scanner keyboard = new Scanner(System.in);
        DirtyHarryNumGuesser game;
        game = new DirtyHarryNumGuesser();
        //inputs
        System.out.println("\nDo you feel lucky, Punk?");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nWell do ya?");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nI know what your thinking...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nDo I have 5 shots or 6??");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nWell, you've got 3 shots to guess the number....GO!!!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (turns > 0) {
            randomNum = (int)(Math.random() * 10 + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\nPlease guess a whole number from 1 - 10");
            userGuess = keyboard.nextInt();
            //set
            game.setUserGuess(userGuess);
            game.setRandomNum(randomNum);
            //compute
            game.checkUserGuess();
            //get
            result = game.getResult();
            //output
            System.out.println("\nYou guessed "+ userGuess);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\nThe number we were looking for was " + randomNum);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(result+"\n");
            turns--;
            if (userGuess == randomNum) {
                break;
            }
        }
        keyboard.close();
    }
}