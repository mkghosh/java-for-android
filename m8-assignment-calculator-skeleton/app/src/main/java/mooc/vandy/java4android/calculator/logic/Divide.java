package mooc.vandy.java4android.calculator.logic;

import android.graphics.Path;

/**
 * Perform the Divide operation.
 */
public class Divide {


    /**
     * <h1>This method will divide the first number with the second number and return the integer divisoin</h1>
     * <p>This is an integer operation so all the operation will work that way.</p>
     * @param firstNumber {@link Integer} first number of the operation provided by the user.
     * @param secondNumber {@link Integer} second number of the operation provided by the user.
     * @return {@link Integer} returns the result obtained by the operation.
     */
    public static int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    /**
     * <h1>This method will only work for the division operator.</h1>
     * @param firstNumber {@link Integer} first number of the operation provided by the user.
     * @param secondNumber {@link Integer} second number of the operation provided by the user.
     * @return {@link Integer} returns the remainder of the division operator.
     */
    public static int remainder(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
