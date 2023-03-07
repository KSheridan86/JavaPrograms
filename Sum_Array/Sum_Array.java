/*
Ken Sheridan
Sum_Array.java
06/03/2023
*/

// Program to sum the rows and columns of a 3x3 array
public class Sum_Array {
    public static void main(String[] args) {
        // Create a 3x3 array and fill it with values
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Calculate the sum of each row
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            System.out.println("Sum of row " + (i+1) + ": " + rowSum);
        }

        // Calculate the sum of each column
        for (int i = 0; i < array[0].length; i++) {
            int colSum = 0;
            for (int j = 0; j < array.length; j++) {
                colSum += array[j][i];
            }
            System.out.println("Sum of column " + (i+1) + ": " + colSum);
        }

        // sum entire array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of entire array: " + sum);
    }
}