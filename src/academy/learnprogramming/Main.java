package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        // inter with name myValue with initialized value of 10000

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        // Wrapper class Integer
        // ALl eight primitive data types have a wrapper class that have some built in methods

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        // Integer Minimum Value = -2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Integer Maximum Value = 2147483647
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // test to see if it errors
        // Busted MAX value = -2147483648 it did a overflow to the other side of the spectrum and gave min value
        System.out.println("Busted MIN value = "  + (myMinIntValue - 1));
        // Busted MIN value = 2147483647
        // underflow instead of overflow

//        int myMaxIntTest = 2147483648;
        // will show errors in code block when trying to manually type in a number too large
         int myMaxIntTest = 2_147_483_647;
         // underscore instead of commas when going to large 
    }
}
