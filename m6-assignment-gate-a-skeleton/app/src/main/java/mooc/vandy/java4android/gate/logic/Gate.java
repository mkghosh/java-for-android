package mooc.vandy.java4android.gate.logic;

/**
 * @@ Julie, please fill in here.
 */
public class Gate {

    /**
     * <h1>The instance variable for the outstate</h1>
     */
    public static final int OUT = -1;

    /**
     * <h1>The instance variable for the instate</h1>
     */
    public static final int IN = 1;

    //private instance variable for the lock status
    private boolean locked;

    //private instance variable for the swing
    private int swing;

    /**
     * <h1>Public constructor for the Gate to create a new instance of the Gate object.</h1>
     */
    public Gate() {
        swing = 0;
        locked = true;
    }

    /**
     * <h1>This method is intended for getting the status of the gate.</h1>
     * @return {@link Boolean} true if the gate is locked otherwise false.
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * <h1>Returns the swing status of the gate.</h1>
     * @return {@link Integer} 0 if the gate is locked initially.
     * 1 if the gates swing is enabled for IN state -1 otherwise.
     */
    public int getSwingDirection() {
        return swing;
    }

    /**
     * <h1>Closes the gate.</h1>
     */
    public void close() {
        this.locked = true;
    }

    /**
     * <h1>Opens the gate with the given swing.</h1>
     * @param swingDirection {@link Integer} swing direction regarding in and out state.
     * @return {@link Boolean} true if swingDirection is valid false otherwise.
     */
    public boolean open(int swingDirection) {
        locked = ! (swingDirection == IN || swingDirection == OUT);
        return setSwing(swingDirection);
    }

    /**
     * <h1>Sets the swing status with the given swing if it is a valid one.</h1>
     * @param swing {@link Integer} Swing to be set.
     * @return {@link Boolean} true if swing is valid and set properly false otherwise.
     */
    public boolean setSwing(int swing) {
        if(swing == IN || swing == OUT) {
            this.swing = swing;
            return true;
        }
        return false;
    }

    /**
     * <h1>Gives the number of animals gone through the gate.</h1>
     * @param numberOfAnimals {@link Integer} number of animals to thru.
     * @return {@link Integer} 0 if the gate is locked and the number of animals with sign indicating if they are gone out or in to the pen.
     */
    public int thru(int numberOfAnimals) {
        if(locked)
            return 0;
        else if(getSwingDirection() == IN)
            return numberOfAnimals;
        return OUT * numberOfAnimals;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("This gate");
        if(isLocked())
            sb.append(" is locked");
        else
        {
            sb.append(" is not locked  and swings");
            switch (getSwingDirection())
            {
                case 0:
                    sb.append(" but the swing is not set properly");
                    break;
                case 1:
                    sb.append("  to enter the pen only");
                    break;
                case -1:
                    sb.append(" to exit the pen only");
                    break;
            }
        }
        return sb.toString();
    }
}
