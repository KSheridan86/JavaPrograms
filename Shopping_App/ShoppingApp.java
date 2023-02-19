/*
ShoppingApp.java
K.Sheridan
3/2/2023
*/

//Application to work out the total cost of shopping
import java.util.*;
//Class signature
public class ShoppingApp {
	//Main method
	public static void main(String args[]) {
		//Variables
		int milkAmount;
		int breadAmount;
		int biscuitAmount;
		double totalCost;

		//Objects + initialize
		Scanner keyboard = new Scanner(System.in);
		Shopping purchases;
		purchases = new Shopping();
		//Inputs
		System.out.println("How many milk do you want?");
		milkAmount = keyboard.nextInt();
		System.out.println("How many bread do you want?");
		breadAmount = keyboard.nextInt();
		System.out.println("How many biscuits do you want?");
		biscuitAmount = keyboard.nextInt();
		keyboard.close();
		//Set
		purchases.setMilkAmount(milkAmount);
		purchases.setBreadAmount(breadAmount);
		purchases.setBiscuitAmount(biscuitAmount);
		//compute
		purchases.setTotalCost();
		//Get
		totalCost = purchases.totalPrice();
		//output
		System.out.println("Your bill comes to: " + totalCost);
	}
}