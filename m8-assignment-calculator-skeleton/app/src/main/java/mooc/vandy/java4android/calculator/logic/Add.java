package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Operation{

    /**
     * <h1>Constructor matching the super class</h1>
     * @param num1 {@link Integer} first number of the operation.
     * @param num2 {@link Integer} second number of the operation.
     */
    public Add(int num1, int num2) {
        super(num1,num2);
    }

    @Override
    public int operate() {
        return getFirstNum() + getSecondNum();
    }
}
