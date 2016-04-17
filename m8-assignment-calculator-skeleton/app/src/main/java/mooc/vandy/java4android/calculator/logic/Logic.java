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

        Operation operation1 = null;
        switch (operation) {
            case ADD:
                operation1 = new Add(argumentOne, argumentTwo);
                mOut.print("" + operation1.operate());
                break;

            case SUBTRACT:
                operation1 = new Subtract(argumentOne, argumentTwo);
                mOut.print("" + operation1.operate());
                break;

            case MULTIPLY:
                operation1 = new Multiply(argumentOne, argumentTwo);
                mOut.print("" + operation1.operate());
                break;

            case DIVIDE:
                if(argumentTwo == 0) {
                    mOut.createToast("No number can be divided by zero. Please provide a number other then zero in the second argument.");
                    break;
                }

                operation1 = new Divide(argumentOne, argumentTwo);
                //casting the operatoin1 object to Divide to able to access the specialized method of the Divide class.
                Divide divisionOperator = (Divide) operation1;

                int divResult = divisionOperator.operate();
                int remainder = divisionOperator.remainder(argumentOne, argumentTwo);

                mOut.print("" + divResult + " R: " + remainder );
                break;
        }
    }
}
