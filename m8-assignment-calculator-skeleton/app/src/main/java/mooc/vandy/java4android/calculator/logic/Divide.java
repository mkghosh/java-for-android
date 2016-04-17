package mooc.vandy.java4android.calculator.logic;

import android.graphics.Path;

/**
 * Perform the Divide operation.
 */
public class Divide extends Operation{

    /**
     * <h1>Constructor matching the super</h1>
     * @param num1 {@link Integer} first number of the operation.
     * @param num2 {@link Integer} second numbeer of the operation.
     */
    public Divide(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int operate() {
        return getFirstNum() / getSecondNum();
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
