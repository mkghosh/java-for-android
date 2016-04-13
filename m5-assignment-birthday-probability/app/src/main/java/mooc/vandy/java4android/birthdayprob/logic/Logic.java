package mooc.vandy.java4android.birthdayprob.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import mooc.vandy.java4android.birthdayprob.ui.OutputInterface;

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
    public static final String TAG =
        Logic.class.getName();

    /**
    * This is the variable that stores our OutputInterface instance.
    * <p>
    * This is how we will interact with the User Interface [MainActivity.java].
    * <p>
    * It is called 'out' because it is where we 'out-put' our
    * results. (It is also the 'in-put' from where we get values from,
    * but it only needs 1 name, and 'out' is good enough)
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
     * on-screen button labelled 'Process...' is pressed.
     */
    public void process() {
        int groupSize = mOut.getSize();
        int simulationCount = mOut.getCount();

        if (groupSize < 2 || groupSize > 365) {
            mOut.makeAlertToast("Group Size must be in the range 2-365.");
            return;
        }

        if (simulationCount <= 0) {
            mOut.makeAlertToast("Simulation Count must be positive.");
            return;
        }

        double percent = calculate(groupSize,
                                   simulationCount);

        // report results
        mOut.println("For a group of " + groupSize + " people, the percentage");
        mOut.println("of times that two people share the same birthday is");
        mOut.println(String.format("%.2f%% of the time.", percent));
    }

    /**
     * This is the method that actually does the calculations.
     * <p>
     * We provide you this method that way we can test it with unit
     * testing.
     */
    public double calculate(int size, int count) {
        // TODO -- add your code here
        int totalSimulationWithAtLeastOnePair = 0;

        for(int i = 0; i < count; i++) {
//            Set<Integer> simulation = birthdaySimulationSet(size,i);
            List<Integer> simulation = birthdaySimulationList(size, i);

            boolean hasPair = checkPairWithList(simulation);//simulation.size() < size;

            if (hasPair)
                totalSimulationWithAtLeastOnePair++;
        }
        return (totalSimulationWithAtLeastOnePair * 100.0)/count;
    }

    //Faster Implementation with HashMap.
    //Checks the simulation if there is any duplicate key available for the new key.
    //Returns true if available.
    private boolean hasSameKey(int size, int simulationCount) {
        Random random = new Random(simulationCount);

        Map<Integer,Integer> birthdayMap = new HashMap<>(size);

        for (int i = 0; i < size; i++) {
            int value = random.nextInt(365);
            if(birthdayMap.containsKey(value)) {
                return true;
            } else {
                birthdayMap.put(value, 1);
            }
        }

        return false;
    }

    //Faster Implementation with Set
    //Checks if Same Birthday is already available in the set.
    private boolean sameBirthdayWithSet(int size, int simulationCount) {

        Random random = new Random(simulationCount);

        Set<Integer> birthdaySet = new HashSet<>(size);

        for (int i = 0; i < size; i++) {
            int value = random.nextInt(365);
            if (birthdaySet.contains(value)) {
                return true;
            } else {
                birthdaySet.add(value);
            }
        }

        return false;
    }

    //Poor implementation with Set.
    //Generating a Set of birthdays
    private Set<Integer> birthdaySimulationSet(int size, int simulationCount) {

        Random random = new Random(simulationCount);

        Set<Integer> birthdaySet = new HashSet<>(size);

        for (int i = 0; i < size; i++) {
            birthdaySet.add(random.nextInt(365));
        }

        return birthdaySet;
    }

    //Returns a list of items (i.e whole simulation
    private List<Integer> birthdaySimulationList(int size, int simulationCount) {

        Random random = new Random(simulationCount);

        List<Integer> birthdayList = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            birthdayList.add(i,random.nextInt(365));
        }

        return birthdayList;
    }

    //Poor implementation
    //Determines if the pair is available
    public boolean checkPairWithList(List<Integer> birthdayList) {
        Set<Integer> birthdaySet = new HashSet<>(birthdayList);
        return birthdaySet.size() < birthdayList.size();
    }

    //Slow implementation
    //Checks if any of the two candidate have the same birthday in a simulation.
    public boolean checkSameBirthdayWithList(List<Integer> birthdays) {

        boolean hasPair = false;
        for (Integer birthday : birthdays) {
            for (int i = (birthdays.indexOf(birthday) + 1); i < (birthdays.size()); i++) {
                if (birthday.equals(birthdays.get(i)))
                    hasPair = true;
            }
            if(hasPair) break;
        }
        return hasPair;
    }
}
