/*
Ken sheridan
Array.java
09/03/2023
*/

// Program to sum each row, column and total value of a 3x3 array
public class Array {
    public static void main(String[] args) {
        // Vars
        int[][] arr = { { 88, 25, 12 }, { 40, 75, 628 }, { 47, 558, 4569 } };
        int sumOfRow, sumOfCol, total = 0;
        // Process & Outputs
        // Sum each row and print it out
        System.out.println();
        for (int row = 0; row < 3; row++) {
            sumOfRow = 0;
            for (int col = 0; col < 3; col++) {
                sumOfRow += arr[row][col];
            }
            System.out.println("Sum of row " + (row+1) + ": " + sumOfRow);
        }
        System.out.println();
        // Sum each column and print it out
        for (int col = 0; col < 3; col++) {
            sumOfCol = 0;
            for (int row = 0; row < 3; row++) {
                sumOfCol += arr[row][col];
            }
            System.out.println("Sum of column " + (col+1) + ": " + sumOfCol);
        }
        System.out.println();
        // Sum the entire array and print it out
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                total += arr[row][col];
            }
        }
        System.out.println("Total sum: " + total + "\n");
    }
}