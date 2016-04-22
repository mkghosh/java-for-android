package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {

    //instance variables
    private String owner;
    private boolean pool;

    /**
     * <h1>Constructor to support the super class of the house.</h1>
     *
     * @param length    {@link Integer} of the {@link House}
     * @param width     {@link Integer} of the {@link House}
     * @param lotLength {@link Integer} of the {@link House}
     * @param lotWidth  {@link Integer} of the {@link House}
     */
    public House(int length, int width, int lotLength, int lotWidth) {
        //a call to the parent class constructor.
        super(length, width, lotLength, lotWidth);
    }

    /**
     * <h1>Constructor to support extra parameter.</h1>
     *
     * @param length    {@link Integer} of the {@link House}
     * @param width     {@link Integer} of the {@link House}
     * @param lotLength {@link Integer} of the {@link House}
     * @param lotWidth  {@link Integer} of the {@link House}
     * @param owner     {@link String} of the {@link House}
     */
    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        //call to its own constructor
        this(length, width, lotLength, lotWidth);
        this.owner = owner;
    }

    /**
     * <h1>Constructor to support extra parameter.</h1>
     *
     * @param length    {@link Integer} of the {@link House}
     * @param width     {@link Integer} of the {@link House}
     * @param lotLength {@link Integer} of the {@link House}
     * @param lotWidth  {@link Integer} of the {@link House}
     * @param owner     {@link String} of the {@link House}
     * @param pool      {@link Boolean} available in the {@link House}
     */
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        //Call to its own constructor.
        this(length, width, lotLength, lotWidth, owner);
        this.pool = pool;
    }

    /**
     * <h1>To get the owner of the house this method is used.</h1>
     *
     * @return {@link String} owner of the house.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <h1>Sets the owner of the house</h1>
     *
     * @param owner {@link String} of the House.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <h1>Checks if the house has a pool or not.</h1>
     *
     * @return {@link Boolean} true if the house has pool false otherwise
     */
    public boolean hasPool() {
        return pool;
    }

    /**
     * <h1>Sets if the house has pool or not.</h1>
     *
     * @param pool {@link Boolean} house has pool or not.
     */
    public void setPool(boolean pool) {
        this.pool = pool;
    }

    /**
     * <h1>Overriden toString method to show the status of the {@link House}</h1>
     *
     * @return {@link String} representation of {@link House}.
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Owner: " + this.getOwner() + "; ");
        if (this.calcBuildingArea() < this.calcLotArea())
            sb.append("has a big open space");
        else
            sb.append("has no open space at all");
        return sb.toString();
    }

    /**
     * <h1>Overriden equals method to check the equality of two {@link House}</h1>
     *
     * @param houseObject {@link Object} House objects can be checked whether it is equals or not.
     * @return {@link Boolean} true if equals or false.
     */
    @Override
    public boolean equals(Object houseObject) {
        if (House.class.isInstance(houseObject)) {
            House otherHouse = (House) houseObject;
            return (pool == otherHouse.pool) && super.equals(otherHouse);
        }
        return false;
    }
}
