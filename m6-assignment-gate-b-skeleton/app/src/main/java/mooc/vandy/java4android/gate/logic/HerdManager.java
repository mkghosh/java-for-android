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

    /**
     * <h1>This method Sets the {@link Gate} of the Pen.</h1>
     * <p>If the {@link Gate} is westGate that means it is to enter the snails in the pen.</p>
     * <p>If the {@link Gate} is eastGate that means it is to enter the snails in the pasture</p>
     * @param westGate {@link Gate} for entering the Pen.
     * @param eastGate {@link Gate} for entering the Pasture.
     */
    public void setGates(Gate westGate, Gate eastGate) {

        //seting the gates swing values
        westGate.setSwing(Gate.IN);
        eastGate.setSwing(Gate.OUT);

        //seting the gates to the instance variables
        this.westGate = westGate;
        this.eastGate = eastGate;

    }

    /**
     * <h1>This method is for creating the simulation of the snails to go to and from the pen</h1>
     * @param westGate {@link Gate} for entering the Pen.
     * @param eastGate {@link Gate} for entering the Pasture.
     * @param random {@link Random} for selecting the {@link Gate} and selecting the number of snails to thru.
     */
    public void simulateHerd(Gate westGate, Gate eastGate, Random random) {

        //Setting the number of snails in Pen equals to the number of total herd.
        int inPen = HERD;

        //Setting the number of snails in the pasture to zero.
        int inPasture = 0;

        //printing out the current value of the snails in pen and pasture.
        mOut.print(inPen + " ");
        mOut.print(inPasture + " ");

        //initializing the Gate with null value
        Gate gate = null;

        //Creating a for loop to loop for 10 times.
        for(int i = 0; i < 10; i++) {

            //setting the gate's value to the desired gate
            if(inPasture == 0) {
                gate = eastGate;
            } else {
                gate = random.nextBoolean() ? eastGate : westGate;
            }

            //Moving the snails according to the selection of the gate.
            if(gate.getSwingDirection() == Gate.IN) {
                int numberOfSnailToMove = random.nextInt(inPasture) + 1;
                inPasture -= numberOfSnailToMove;
                inPen += numberOfSnailToMove;
                mOut.print(inPen  + " ");
                mOut.print(inPasture + " ");
            } else {
                int numberOfSnailToMove = random.nextInt(inPen) + 1;
                inPen -= numberOfSnailToMove;
                inPasture += numberOfSnailToMove;
                mOut.print(inPen + " ");
                mOut.print(inPasture + " ");
            }

        }
    }
}
