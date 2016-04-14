package mooc.vandy.java4android.buildings.logic;

import android.util.Log;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

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
     * Used for logging.
     */
    public static final String TAG =
        Logic.class.getName();

    /**
     * Reference to the output object.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * Perform the computation.
     */
    @Override
    public void process() {
        BuildingList list = new BuildingList();

        House[] house = list.getHouses();
        Office[] office = list.getOffices();

        Neighborhood.print(house, "Houses", mOut);
        mOut.println("");
        Neighborhood.print(office, "Offices", mOut);

        mOut.println("");
        mOut.println("Total neighborhood area: " +
                     (Neighborhood.calcArea(house) +
                      Neighborhood.calcArea(office)));
    }
}
