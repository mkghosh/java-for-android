package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        drawDiamond(size);

    }

    private void drawDiamond(int size) {
        int totalRow = 2 * size + 1;
//        log("Total Row is : " + totalRow);
        int totalCol = totalRow + 1;
//        log("Total column is : " + totalCol);
        for(int i = 1; i <= totalRow; i++){
            //TODO Need to be updated
            if(i == 1 || i == totalRow) {
                drawEndingLine(totalCol);
            } else if(i == (size + 1)) {
                drawMiddleLine(totalCol);
            } /*else {
                drawLine();
            }*/
        }

    }

    // TODO -- add your code here

    private void drawLine() {

    }

    private void drawEndingLine(int lineLength) {
        log("the lineLength is : " + lineLength);
        for (int i = 0; i < lineLength; i++) {

            if(i == 0) {
                mOut.print("+");
            } else if(i == lineLength -1) {
                mOut.println("+");
            } else {
                mOut.print("-");
            }
        }
    }

    private void drawMiddleLine(int lineLength) {
        if(lineLength == 4) {
            mOut.print("|<>|\n");
        } else {
            boolean even = lineLength%2 == 0;
            for(int i = 1; i < lineLength; i++) {
                if(i == 1) {
                    mOut.print("|<");
                } else if(i == lineLength - 2) {
                    mOut.println(">|");
                    break;
                } else {
                    if(even) {

                    } else {

                    }
                }
            }
        }
    }

    private void drawUpperDiamond(int size) {

    }

    private void drawLowerDiamond(int size) {

    }

    private void log(String str) {
        Log.d("TestM >>> ",str);
    }
}
