package com.thealgorithms.maths;

/**
 * An Armstrong number is equal to the sum of the cubes of its digits. For
 * example, 370 is an Armstrong number because 3*3*3 + 7*7*7 + 0*0*0 = 370. An
 * Armstrong number is often called Narcissistic number.
 *
 * @author Vivek
 */
public class Armstrong {

    /**
     * Checks whether a given number is an armstrong number or not.
     *
     * @param number number to check
     * @return {@code true} if given number is armstrong number, {@code false}
     * otherwise
     */
    public boolean isArmstrong(int number) {
        int sum = 0;
        int number2 = number;
        while (number2 > 0) {
            int mod = number2 % 10;
            sum=sum*10+mod;
            number2 /= 10;
        }
        return sum == number;
    }
}
