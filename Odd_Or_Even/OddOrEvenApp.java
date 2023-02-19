/*
OddOrEvenApp.java
Ken Sheridan
10/02/23
*/

//Application to determine whether a user inputted number is odd or even.
import java.util.*;
public class OddOrEvenApp {
    public static void main(String[] args) {
        //declare vars
        int userNum;
        String result;
        //declare and create objects
        Scanner keyboard = new Scanner(System.in);
        OddOrEven check;
        check = new OddOrEven();
        //inputs
        System.out.println("Please enter a whole number...");
        userNum = keyboard.nextInt();
        keyboard.close();
        //set
        check.setUserNum(userNum);
        //compute
        check.computeOddOrEven();
        //get
        result = check.getResult();
        //output
        System.out.println("Your number is: " + result);
    }
}