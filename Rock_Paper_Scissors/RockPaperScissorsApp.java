/*
RockPaperScissorsApp.java
Ken Sheridan
19/02/23
*/

/*  Rock Paper Scissors Game.
 The lab brief states that the Scanner class MUST be used, but at the bottom of the advanced labs it asks to,
    "Change the application to use JOptionPane showOptionDialog"
 So I have included both options here, the Scanner class is currently operational.
 To try out the JOption pane dialog boxes, simply comment out the code on lines: 34 - 36, 53 & 54, 67.
 And uncomment the code on lines: 16, 30 - 33, 45 - 52, 65 & 66, 75 & 76.
 It also states to use 1, 2 & 3 as options for the "Rock", "Paper", "Scissors" selections
 But when using the JOptionPane optionDialog 0, 1 & 2 are needed to make your selection, so the options have been changed to reflect this alteration.
 */

import java.util.*;
// import javax.swing.*;
import java.lang.Thread;
public class RockPaperScissorsApp {
    public static void main(String[] args) {
        //declare vars
        int userChoice;
        int compChoice;
        int roundsToPlay;
        String result;
        //declare and create objects
        Scanner keyboard = new Scanner(System.in);
        RockPaperScissors game;
        game = new RockPaperScissors();
        //inputs
        System.out.println("\nWelcome to Rock, Paper Scissors! \n");
        System.out.println("How many rounds would you like to play?");
        roundsToPlay = keyboard.nextInt();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        while (roundsToPlay > 0) {
            System.out.println("Make your choice, enter 0 for Rock, 1 for Paper or 2 for Scissors.");
            userChoice = keyboard.nextInt();
            compChoice = (int)(Math.random() * 3);
            //set
            game.setUserChoice(userChoice);
            game.setCompChoice(compChoice);
            //compute
            game.compareMoves();
            //get
            result = game.getResult();
            //output
            roundsToPlay--;
            System.out.println("\n" + result + "\n");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (roundsToPlay == 0) {
                System.out.println("Thanks for playing!\n");
                keyboard.close();
            }
        }
    }
}