/*
Random_Number_Array.java
Ken Sheridan
03/04/23
*/

// Instantiable class for generating an array of random numbers with a random length.
import java.util.*;

public class RandomNumberArray {
    // Declare Vars
    private int[] numbers;

    // Constructor
    public RandomNumberArray(int minSize, int maxSize, int startRange, int endRange) {
        Random random = new Random();
        int size = random.nextInt(maxSize - minSize + 1) + minSize;
        this.numbers = new int[size];
        for (int i = 0; i < size; i++) {
            this.numbers[i] = random.nextInt(endRange - startRange) + startRange;
        }
    }

    // Get Method
    public int[] getNumbers() {
        return this.numbers;
    }
}