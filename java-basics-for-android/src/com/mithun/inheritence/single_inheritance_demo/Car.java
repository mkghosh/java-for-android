package com.mithun.inheritence.single_inheritance_demo;

/**
 * @author Mithun Kumer Ghose.
 */
public class Car extends Vehicle {

    /**
     * <p>This properties will calculate all the distance travelled yet by the vehicle.</p>
     */
    public double distanceTravelled = 0.0;

    private String carName;

    private static double acceleration = 0;

    public Car(String carName) {
        this.carName = carName;
    }
    @Override
    public void start() {
        System.out.println(carName + " is started.");
    }

    @Override
    public void accelerate(double acceleration) {
        this.acceleration += acceleration;
        System.out.println(carName + " accelerated by " + acceleration + "\n"
        + " The current acceleration is " + Car.acceleration);
    }

    @Override
    public double getDistanceTraveled() {
        return this.distanceTravelled;
    }

    @Override
    public void travel(double distanceToTravel) {
        this.distanceTravelled += distanceToTravel;
        System.out.println(carName + " is going to travel " + distanceToTravel);
    }
}
