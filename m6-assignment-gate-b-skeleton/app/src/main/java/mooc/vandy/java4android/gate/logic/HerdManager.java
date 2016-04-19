package mooc.vandy.java4android.gate.logic;

import android.util.Log;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This executable Android App will use your Gate class.  We have
 * supplied you will the code necessary to execute as an app.  You
 * must fill in the missing logic below.
 */
public class HerdManager {

    public final int HERD = 24;
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;
    private long seed = 1234;

    //The Gates to need to work with the Gate class.
    private Gate westGate; //In to the Herd
    private Gate eastGate; //Out from the Herd (i.e got to pastrue)

    /**
     * Constructor initializes the field.
     */
    public HerdManager(OutputInterface out){
        mOut = out;
    }

    // TODO -- Fill your code in here
    public void setGates(Gate westGate, Gate eastGate) {

        //seting the gates swing values
        westGate.setSwing(Gate.IN);

        eastGate.setSwing(Gate.OUT);

        //seting the gates to the instance variables
        this.westGate = westGate;
        this.eastGate = eastGate;

    }

    public void simulateHerd(Gate westGate, Gate eastGate, Random random) {
        int numberOfSnailInPen = HERD;
        int numberOfSnailInPasture = 0;

        mOut.print(numberOfSnailInPen + " ");
        mOut.print(numberOfSnailInPasture + " ");
        Gate gate = null;
        Random rand = new Random(seed);
        for(int i = 0; i < 10; i++) {

            if(numberOfSnailInPasture == 0) {
                gate = eastGate;
            } else {
                boolean gateSelection = random.nextInt(1) == 1;
                gate = gateSelection ? eastGate : westGate;

            }

            if(gate.getSwingDirection() == Gate.IN) {
                int numberOfSnailToMove = random.nextInt(numberOfSnailInPasture) + 1;
                numberOfSnailInPasture -= numberOfSnailToMove;
                numberOfSnailInPen += numberOfSnailToMove;
                mOut.print(numberOfSnailInPasture + " ");
                mOut.print(numberOfSnailInPen  + " ");
            } else {
                int numberOfSnailToMove = random.nextInt(numberOfSnailInPen) + 1;
                numberOfSnailInPen -= numberOfSnailToMove;
                numberOfSnailInPasture += numberOfSnailToMove;
                mOut.print(numberOfSnailInPen + " ");
                mOut.print(numberOfSnailInPasture + " ");
            }

        }
    }
}
