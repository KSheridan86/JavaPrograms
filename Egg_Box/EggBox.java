/*
EggBox.java
K.Sheridan
1/2/2023
*/

// Application to work out how many egg boxes are needed for a specific number of eggs.

public class EggBox{
	//vars/(data members in instantiable classes)
	//keep data members private in instantiable classes
	//points given for variables/data members
	private int eggs; //input
	private int boxSize; //input
	private int numBoxes; //output
	private int leftOverEggs; //output
	//constructor
	// points given for constructor variables/data members
	public EggBox() {
		eggs=0;
		boxSize=0;
		numBoxes=0;
		leftOverEggs=0;
	}
	//set
	public void setEggs(int eggs){
		this.eggs=eggs;
	}
	public void setBoxSize(int boxSize){
		this.boxSize=boxSize;
	}
	//compute
	public void computeBoxes(){
		numBoxes=eggs/boxSize;
	}
	public void computeLeftover(){
		leftOverEggs=eggs%boxSize;
	}
	//get
	public int getBoxes(){
		return numBoxes;
	}
	public int getLeftover(){
		return leftOverEggs;
	}
}