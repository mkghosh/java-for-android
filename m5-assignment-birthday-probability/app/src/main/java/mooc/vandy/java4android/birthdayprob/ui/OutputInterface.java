package mooc.vandy.java4android.birthdayprob.ui;

/**
 * Ignore this Interface for now. It defines the methods that the User Interface [MainActivity]
 * will implement. Interfaces will be covered later in this course.
 */
public interface OutputInterface {

    public int getSize();

    public int getCount();

    public void print(String text);

    public void print(char _char);

    public void println(String text);

    public void println(char _char);

    public void resetText();

    public void log(String logtext);

    public void makeAlertToast(String alertText);

}
