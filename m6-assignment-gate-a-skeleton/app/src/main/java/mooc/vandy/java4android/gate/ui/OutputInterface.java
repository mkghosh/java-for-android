package mooc.vandy.java4android.gate.ui;

/**
 * Interface that defines the methods that the User Interface
 * [MainActivity] will implement.
 */
public interface OutputInterface {
    /**
     * This prints to the output a string.
     * @param text
     */
    public void print(String text);

    /**
     * This prints to the output a char.
     * @param _char
     */
    public void print(char _char);

    /**
     * This prints to the screen a string then a new line.
     * @param text
     */
    public void println(String text);

    /**
     * This prints to the screen a char then a new line.
     * @param _char
     */
    public void println(char _char);

    /**
     * Reset the on-screen output (EditText box).
     */
    public void resetText();

    /**
     * Allow Logic to print Log statements without requiring dependency.
     */
    public void log(String logtext);
}
