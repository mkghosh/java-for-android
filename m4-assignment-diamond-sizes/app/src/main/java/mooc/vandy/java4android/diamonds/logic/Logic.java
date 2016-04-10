package mooc.vandy.java4android.diamonds.logic;

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

    //This private method will Draw the entire diamond
    //It takes the size of the diamond as its parameter
    private void drawDiamond(int size) {

        //Calculating total row of the diamond
        int totalRow = 2 * size + 1;
        //Calculating total column of the diamond
        int totalCol = totalRow + 1;

        //Looping over the total row.
        for(int i = 1; i <= totalRow; i++){

            if(i == 1 || i == totalRow)
            {
                //Draws the ending lines of the diamond (i.e first and last line).
                drawEndingLine(totalCol);
            }
            else if(i == (size + 1))
            {
                //Draws the middle line of the diamond.
                drawMiddleLine(i, totalCol);
            }
            else
            {
                //Draws other lines of the diamond.
                drawLines(i,totalCol,size);
            }
        }

    }

    // TODO -- add your code here

    //Draws lines other then ending and middle
    //This method takes three parameter line number line length (i.e column number) and the size of the diamond.
    private void drawLines(int lineNumber,int lineLength, int size) {
        //Checking if the line number is even or odd.
        boolean even = lineNumber % 2 == 0;

        //Checking if the line is lower part or upper part.
        boolean lower = lineNumber > size;

        int lineSpacing = 0;

        //Calculating the line spacing.
        if(lineNumber <= size)
        {
            lineSpacing = size - (lineNumber - 1);
        }
        else
        {
            lineSpacing = lineNumber - (size +1);
        }

        //Looping over the length of the line.
        for(int i = 0; i < lineLength; i++) {
            if(i == 0)
            {
                mOut.print("|");
            }
            else if(i == lineLength -1)
            {
                mOut.println("|");
            }
            else if(i <= lineSpacing)
            {
                drawSpace(lineSpacing);
                mOut.print(lower ? "\\" : "/");
                i = lineSpacing + 1;
            }
            else if((lineSpacing + i) == (lineLength - 2) )
            {
                mOut.print(lower ? "/" : "\\");
                drawSpace(lineSpacing);
                i += lineSpacing;
            }
            else
            {
                drawEvenOddNotation(even);
            }
        }
    }

    //Draws the required spaces
    private void drawSpace(int numberOfSpace) {

        for (int i = 0; i < numberOfSpace; i++)
        {
            mOut.print(" ");
        }
    }

    //Draws the ending lines (i.e the starting and the last line) of the diamond
    private void drawEndingLine(int lineLength) {

        for (int i = 0; i < lineLength; i++)
        {
            if(i == 0)
            {
                mOut.print("+");
            }
            else if(i == lineLength -1)
            {
                mOut.println("+");
            }
            else
            {
                mOut.print("-");
            }
        }
    }

    //Draws the middle line of the diamond.
    private void drawMiddleLine(int lineNumber, int lineLength) {

        if(lineLength == 4)
        {
            mOut.print("|<>|\n");
        }
        else
        {
            boolean even = lineNumber % 2 == 0;

            for(int i = 1; i < lineLength; i++)
            {
                if(i == 1)
                {
                    mOut.print("|<");
                }
                else if(i == lineLength - 2)
                {
                    mOut.println(">|");
                    break;
                }
                else
                {
                    drawEvenOddNotation(even);
                }
            }
        }
    }

    //Draws the even or odd notation (i.e "=" or "-")
    private void drawEvenOddNotation(boolean even) {
        mOut.print(even?"=":"-");
    }
}
