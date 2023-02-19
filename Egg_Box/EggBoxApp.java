/*
EggBoxApp.java
K.Sheridan
1/2/2023
*/

import java.util.*;
//Class Signature
public class EggBoxApp{
	//Main Method
	public static void main(String[] args){
		//Variables
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;
		//Objects
		Scanner keyboard = new Scanner(System.in);
		EggBox boxes = new EggBox();
		// boxes = new EggBox();
		//Inputs
		System.out.println("How many eggs have you got?");
		eggs = keyboard.nextInt();
		System.out.println("How many eggs can a box hold?");
		boxSize = keyboard.nextInt();
		keyboard.close();
		//Set
		boxes.setEggs(eggs);
		boxes.setBoxSize(boxSize);
		//Compute
		boxes.computeBoxes();
		boxes.computeLeftover();
		//Get
		numBoxes=boxes.getBoxes();
		leftOverEggs=boxes.getLeftover();
		//Output
		if (numBoxes < 2) {
			System.out.println("You will need "+numBoxes+" box.");
		} else {
			System.out.println("You will need "+numBoxes+" boxes.");
		}
		if (leftOverEggs < 2) {
			System.out.println("There will be "+leftOverEggs+" egg left over.");
		} else {
			System.out.println("There will be "+leftOverEggs+" eggs left over.");
		}
	}
}