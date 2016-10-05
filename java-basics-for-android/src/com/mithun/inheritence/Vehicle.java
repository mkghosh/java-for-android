package com.mithun.inheritence;

/**
 * @author Mithun Kumer Ghose.
 */
public abstract class Vehicle {

    /**
     * <p>This properties will calculate all the distance travelled yet by the vehicle.</p>
     */
    public static double distanceTravelled = 0.0;

    /**
     * <p>Starts the vehicle.</p>
     */
    public abstract void start();

    /**
     * <p> Accelerates the vehicle by the given amount.</p>
     *
     * @param acceleration {@link Double} the amount of acceleration intended by the user.
     */
    public abstract void accelerate(double acceleration);

    /**
     * <p>Returns the amount of distance travelled by the vehicle.</p>
     *
     * @return {@link Double} the whole amount of distance travelled by the vehicle.
     */
    public abstract double getDistanceTraveled();

    /**
     * <p>This method will ensure the vehicle to travel by the amount of miles given as parameter.</p>
     *
     * @param distanceToTravel {@link Double} miles to travel.
     */
    public abstract void travel(double distanceToTravel);

}
