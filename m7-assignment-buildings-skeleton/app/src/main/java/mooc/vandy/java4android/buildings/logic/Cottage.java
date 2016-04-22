package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {

    //instance variable
    private boolean secondFloor;

    /**
     * <h1>Constructor of the class.</h1>
     * <p>Since cottage is square so we need to pass dimension as length and width of the cottage</p>
     *
     * @param dimension {@link Integer} of the cottage
     * @param lotLength {@link Integer} of the cottage
     * @param lotWidth  {@link Integer} of the cottage
     */
    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth);
    }

    /**
     * <h1>Overloaded constructor to set extra information to the cottage</h1>
     *
     * @param dimension   {@link Integer} of the cottage
     * @param lotLength   {@link Integer} of the cottage
     * @param lotWidth    {@link Integer} of the cottage
     * @param owner       {@link String} of the cottage
     * @param secondFloor {@link Boolean} has or not
     */
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean
            secondFloor) {
        this(dimension, lotLength, lotWidth);
        this.setOwner(owner);
        this.secondFloor = secondFloor;
    }

    /**
     * <h1>This method checks if the cottage has second floor or not.</h1>
     *
     * @return {@link Boolean} true if cottage has second floor false otherwise
     */
    public boolean hasSecondFloor() {
        return secondFloor;
    }

    /**
     * <h1>No example spec is found so I have return a empty string for this toString method.</h1>
     *
     * @return {@link String} empty string
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * <h1>Checks the equality of the two cottage object.</h1>
     *
     * @param cottageObject {@link Object} cottage object can be passed to this method.
     * @return {@link Boolean} true if the area of two cottage is equals false otherwise.
     */
    @Override
    public boolean equals(Object cottageObject) {
        if (Cottage.class.isInstance(cottageObject)) {
            Cottage cottage = (Cottage) cottageObject;
            return (this.calcBuildingArea() == cottage.calcBuildingArea());
        }
        return false;
    }
}

