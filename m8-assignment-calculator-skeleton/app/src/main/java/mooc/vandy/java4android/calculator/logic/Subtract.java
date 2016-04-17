package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operation{

    /**
     * <h1>Constructor matching the super</h1>
     * @param num1 {@link Integer} first number of the operation.
     * @param num2 {@link Integer} second numbeer of the operation.
     */
    public Subtract(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int operate() {
        return getFirstNum() - getSecondNum();
    }
}
