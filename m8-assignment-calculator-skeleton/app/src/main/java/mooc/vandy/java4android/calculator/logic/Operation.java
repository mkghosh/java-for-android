package mooc.vandy.java4android.calculator.logic;

/**
 * Created by Mithun Kumer Ghose on 4/17/2016.
 */
public abstract class Operation {

    //Instance variables to get the number to operate on.
    private int firstNum = 0;
    private int secondNum = 0;

    //Public constructor for all of the four operations.
    public Operation (int num1, int num2) {
        firstNum = num1;
        secondNum = num2;
    }

    /**
     * <h1>This method will do the operation to be done and return the result.</h1>
     * <p>This is an integer operation so all the operation will work that way.</p>
     * @return {@link Integer} returns the result obtained by the operation.
     */
    public abstract int operate();

    /**
     * <h1>Getter for the first number.</h1>
     * @return {@link Integer} first number of the operation
     */
    public int getFirstNum() {
        return firstNum;
    }

    /**
     * <h1>Getter for the second number.</h1>
     * @return {@link Integer} second number of the operation
     */
    public int getSecondNum() {
        return secondNum;
    }
}
