public class FindLargestNumber {
    public static void main(String[] args) {
        // Vars
        int[] numbers = {10, 3, 99, 1045, 25};
        // Assume the first number in the array is the largest and compare the rest of the array to it
        int largestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println("\nThe largest number in the array is: " + largestNumber +"\n");
    }
}