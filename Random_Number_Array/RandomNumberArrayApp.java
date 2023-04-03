/*
Random_Number_Array_App.java
Ken Sheridan
03/04/23
*/

// Application to generate an array of random numbers with a random length.
public class RandomNumberArrayApp {
    public static void main(String[] args) {
        // Declare Vars
        int minSize = 4;
        int maxSize = 20;
        int startRange = 0;
        int endRange = 100;
        // Objects
        RandomNumberArray newArray = new RandomNumberArray(minSize, maxSize, startRange, endRange);
        // Get
        int[] numbers = newArray.getNumbers();
        // Output
        System.out.println("\nHere is your randomly generated array of random numbers with a random length:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }
}