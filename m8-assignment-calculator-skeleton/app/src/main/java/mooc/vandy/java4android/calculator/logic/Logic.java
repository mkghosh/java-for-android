package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {

    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int MULTIPLY = 3;
    private static final int DIVIDE = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        switch (operation) {
            case ADD:
                int addResult = Add.add(argumentOne,argumentTwo);
                mOut.print("" + addResult);
                break;
            case SUBTRACT:
                int subResult = Subtract.subtract(argumentOne,argumentTwo);
                mOut.print("" + subResult);
                break;
            case MULTIPLY:
                int multResult = Multiply.multiply(argumentOne, argumentTwo);
                mOut.print("" + multResult);
                break;
            case DIVIDE:
                if(argumentTwo == 0) {
                    mOut.print("No number can be divided by zero. Please provide a number other then zero in the second argument.");
                    break;
                }
                int divResult = Divide.operate(argumentOne, argumentTwo);
                int remainder = Divide.remainder(argumentOne, argumentTwo);

                mOut.print("" + divResult + ". \n" + "" + remainder );
        }
    }
}
