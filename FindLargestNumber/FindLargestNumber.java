/*
FindLargestNumber.java
Ken Sheridan
02/03/23
*/

// Program to find the largest number in a given array
public class FindLargestNumber {
    public static void main(String[] args) {
        // Vars
        int[] nums = {10, 3, 99, 1045, 25, 77, 734, 1, 0, 100};
        // Set the largest Number as 0 and compare each number in the array to it
        int largestNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNum) {
                largestNum = nums[i];
            }
        }
        System.out.println("\nThe largest number in the array is: " + largestNum +"\n");
    }
}