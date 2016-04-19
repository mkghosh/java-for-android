package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This executable Android app will use your Gate.java class.  We have
 * supplied you with the code necessary to execute as an app.  You
 * must fill in the logic.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out){
        mOut = out;
    }

    public void setCorralGates(Gate[] corral, Random rand) {

    }

    public boolean anyCorralAvailable(Gate[] corral) {
        for (Gate gate : corral) {
            if(!gate.isLocked() && gate.getSwingDirection() == Gate.IN)
                return true;
        }
        return false;
    }

    public void corralSnails(Gate[] corral, Random rand) {

    }
    
}
