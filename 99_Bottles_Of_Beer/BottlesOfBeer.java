/*
BottlesOfBeer.java
K.Sheridan
25/2/2023
*/

// Program to print the lyrics of 99 bottles of beer on the wall
public class BottlesOfBeer {
    public static void main(String[] args) {
        //  declare vars
        int num = 99;

        while(num > 0) {
            if(num == 1) {
                System.out.println(num + " bottle of beer on the wall, " + num + " bottle of beer!");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall!\n");
            } else {
                System.out.println(num + " bottles of beer on the wall, " + num + " bottles of beer!");
                System.out.println("Take one down and pass it around, " + (num - 1) + " bottles of beer on the wall!\n");
            }
            num--;
        }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer!");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall!\n");
    }
}