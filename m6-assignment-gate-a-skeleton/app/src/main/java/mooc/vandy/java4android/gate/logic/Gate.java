package mooc.vandy.java4android.gate.logic;

/**
 * @@ Julie, please fill in here.
 */
public class Gate {
    public static final int OUT = -1;
    public static final int IN = 1;

    private boolean locked;
    private int swing;

    public Gate() {
        swing = 0;
        locked = true;
    }

    public boolean isLocked() {
        return locked;
    }

    public int getSwingDirection() {
        return swing;
    }

    public void close() {
        this.locked = true;
    }

    public boolean open(int swingDirection) {
        locked = ! (swingDirection == 1 || swingDirection == -1);
        return setSwing(swingDirection);
    }

    public boolean setSwing(int swing) {
        if(swing == 1 || swing == -1) {
            this.swing = swing;
            return true;
        }
        return false;
    }

    public int thru(int numberOfAnimals) {
        if(locked)
            return 0;
        else if(getSwingDirection() == 1)
            return numberOfAnimals;
        return -numberOfAnimals;
    }

    @Override
    public String toString() {
        if(locked)
            return "This gate is locked";
        return "This gate is opened";
    }
}
