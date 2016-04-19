package mooc.vandy.java4android.gate.logic;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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

    private int maxAttempt = 300;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out){
        mOut = out;
    }

    /**
     * <h1>main method to perform the justification of this class.</h1>
     */
    public void main() {
        FillTheCorral mFillTheCorral = new FillTheCorral(mOut);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        Random rand = new Random();

        Gate[] corral = new Gate[4];
        for (int i = 0; i < corral.length; i++)
            corral[i] = new Gate();

        do {
            mFillTheCorral.setCorralGates(corral, rand);
        } while (!mFillTheCorral.anyCorralAvailable(corral));

        mFillTheCorral.corralSnails(corral, rand);
    }

    /**
     * <h1>Setting the coral gates</h1>
     * <p>This method will call repeatedly until at least one gate has the value IN</p>
     * @param corral {@link Gate[]} number of gates to set.
     * @param rand {@link Random} random value to set and select the swing value of the gate.
     */
    public void setCorralGates(Gate[] corral, Random rand) {
        for(int i =0; i < corral.length; i++) {
            if(rand.nextBoolean()) {
                corral[i].open(Gate.IN);
            } else {
                corral[i].open(Gate.OUT);
            }
            printGateStatus(corral[i], i);
        }
    }

    /**
     * <h1>Checks if any coral is available to enter.</h1>
     * <p>This method checks whether there is any gate with swing value IN is present.</p>
     * @param corral {@link Gate[]} number of gates available
     * @return {@link Boolean} true if any coral is available to enter false otherwise.
     */
    public boolean anyCorralAvailable(Gate[] corral) {
        for (Gate gate : corral) {
            if(!gate.isLocked() && gate.getSwingDirection() == Gate.IN)
                return true;
        }
        return false;
    }

    /**
     * <h1>Sends the snails to the coral or gets the snails to the pasture</h1>
     * @param corral {@link Gate[]} available coral gates
     * @param rand {@link Random} determines number of snails to send or get.
     */
    public void corralSnails(Gate[] corral, Random rand) {
        //Initial value of the snails out to pasture.
        int snailOutToPasture = 5;
        int attempt = 0;

        //Indefinite loop to loops until snailOutToPasture gets to zero
        while(snailOutToPasture > 0 || attempt != maxAttempt) {
            attempt += 1;
            //determines gate number.
            int gateNumber = new Random().nextInt(4) + 1;
            Gate gate = corral[gateNumber];

            //determines the number of snail to move
            int numberOfSnail = rand.nextInt(snailOutToPasture);

            if(gate.getSwingDirection() == Gate.IN) {
                snailOutToPasture -= numberOfSnail;
            } else {
                snailOutToPasture += numberOfSnail;
            }
            //prints the snails status
            printSnailStatus(gate, gateNumber, numberOfSnail, snailOutToPasture);
        }
        mOut.println("It took " + attempt + " attempts to coral all of the snails.");

    }

    //Print out the status of the gate.
    private void printGateStatus(Gate gate, int number) {
        mOut.println("Gate " + number + ": " + gate.toString());
    }

    //prints the status of the snails currently in the pasture and number of snails trying to move.
    private void printSnailStatus(Gate gate, int gateNumber, int numOfSnail, int snailOutToPasture) {

        if(gate.isLocked()) {
            mOut.println(numOfSnail + " snails are trying to move through locked coral " + gateNumber);
        } else if(gate.getSwingDirection() == Gate.IN) {
            mOut.println(numOfSnail + "  snails are trying to move through entry coral " + gateNumber);
        } else {
            mOut.println(numOfSnail + " snails are trying to move through exit coral " + gateNumber);
        }
        mOut.println("There are currently " + snailOutToPasture + " snails still in the pasture");
    }
    
}
