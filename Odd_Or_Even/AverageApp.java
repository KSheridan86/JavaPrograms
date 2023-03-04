/*
Numbers.java
Ken Sheridan
02/03/23
*/

//Application to determine the average of two user inputted numbers
import java.util.*;
public class AverageApp {
    public static void main(String[] args) {
        //declare vars
        int userNum1;
        int userNum2;
        int average;
        String userResponse = "";
        boolean playAgain = false;
        //declare and create objects
        Scanner keyboard = new Scanner(System.in);
        Average check;
        check = new Average();
        //inputs
        do {
            System.out.println("Please enter a whole number...");
            userNum1 = keyboard.nextInt();
            System.out.println("Please enter another whole number...");
            userNum2 = keyboard.nextInt();
            //set
            check.setUserNum1(userNum1);
            check.setUserNum2(userNum2);
            //compute
            check.computeAverage();
            //get
            average = check.getResult();
            //output
            System.out.println("\nThe average of these 2 numbers is... "+average+"\n");
            System.out.println("Would you like to play again? (y/n)");
            userResponse = keyboard.next();
            if (userResponse.equalsIgnoreCase("y")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        } while (playAgain == true);

        keyboard.close();
        //set
        check.setUserNum1(userNum1);
        check.setUserNum2(userNum2);
        //compute
        check.computeAverage();
        //get
        average = check.getResult();
    }
}