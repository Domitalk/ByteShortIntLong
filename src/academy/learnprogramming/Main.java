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

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Mini Value = " + myMinByteValue);
        //Byte Mini Value = -128
        System.out.println("Byte Max Value = " + myMaxByteValue);
        //Byte Max Value = 127

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Mini Value = " + myMinShortValue);
        //Short Mini Value = -32768
        System.out.println("Short Max Value = " + myMaxShortValue);
        //Short Max Value = 32767

        // each data type takes different amounts of memory so it's important to know how far the numbers will go

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Mini Value = " + myMinLongValue);
        // Long Mini Value = -9223372036854775808
        System.out.println("Long Max Value = " + myMaxLongValue);
        // Long Max Value = 9223372036854775807

        long bigLongLiteralValue = 2_147_483_647_234L;
        // the L at the end makes the data into a Long value but without it the saved val is int and it has to be lower than the max
        // In this example, the value without L will error bc its int

        



    }
}
