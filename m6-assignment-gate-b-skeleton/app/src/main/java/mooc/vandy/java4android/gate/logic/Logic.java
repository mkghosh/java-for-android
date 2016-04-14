package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

import static mooc.vandy.java4android.gate.logic.ClassToTest.*;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic implements LogicInterface {
    /**
     * Name of the class for the logger.
     */
    public static final String TAG = Logic.class.getName();

    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will run after the on screen button is pressed.
     */
    @Override
    public void process() {
        ClassToTest classToTest = mOut.getClassToTest();

        /*
         * This code here will only execute one 'case'(or section of code) based 
         * on the chosen drop down selection: 'Corral' or 'Herd' 
         */
        switch (classToTest) {
        case Corral:
            FillTheCorral mFillTheCorral = new FillTheCorral(mOut);

            Random rand = new Random();

            Gate[] corral = new Gate[4];
            for (int i = 0; i<corral.length; i++)
                corral[i] = new Gate();

            do {
                mFillTheCorral.setCorralGates(corral, rand);
            } while (!mFillTheCorral.anyCorralAvailable(corral));

            mFillTheCorral.corralSnails(corral, rand);
            break;

        case Herd:

            HerdManager mHerdManager = new HerdManager(mOut);

            Gate eastGate = new Gate();
            Gate westGate = new Gate();

            mOut.println("East Gate: "+eastGate);
            mOut.println("West Gate: "+westGate);

            mHerdManager.setGates(westGate, eastGate);

            mOut.println("\nEast Gate: "+eastGate);
            mOut.println("West Gate: "+westGate + "\n");

            mHerdManager.simulateHerd(westGate, eastGate, new Random(1234));
            break;

        default:
            break;
        }
    }
}
