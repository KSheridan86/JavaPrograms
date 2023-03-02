package Numbers;
/*
Numbers.java
Ken Sheridan
02/03/23
*/

public class Numbers {
    // Vars
    private int[] initialNumbers;
    private int[] finalNumbers = new int[3];
    // Constructor
    public Numbers() {
        initialNumbers = new int[3];
    }
    // Set
    public void setInitialNumbers(int[] initialNumbers) {
        this.initialNumbers = initialNumbers;
    }
    // Compute
    public void computeFinalNumbers() {
        for (int i = 0; i < initialNumbers.length; i++) {
            finalNumbers[i] = initialNumbers[i] * 9;
        }
    }
    // Get
    public int[] getFinalNumbers() {
        return finalNumbers;
    }
}
