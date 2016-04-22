package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    //instance variables
    private int length;
    private int width;
    private int lotLength;
    private int lotWidth;

    /**
     * <h1>Constructor of Building class.</h1>
     *
     * @param length    {@link Integer} of the building
     * @param width     {@link Integer} of the building
     * @param lotLength {@link Integer} of the building
     * @param lotWidth  {@link Integer} of the building
     */
    public Building(int length, int width, int lotLength, int lotWidth) {
        setLength(length);
        setWidth(width);
        setLotLength(lotLength);
        setLotWidth(lotWidth);
    }

    /**
     * <h1>To get the length of the building this method is used.</h1>
     *
     * @return {@link Integer} length of the building.
     */
    public int getLength() {
        return length;
    }

    /**
     * <h1>Sets the length of the building.</h1>
     * <p>Although this meant to be private but for logic tests it has to be public</p>
     * <p>That is why I have given it public access modifier.</p>
     *
     * @param length {@link Integer} of the building.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * <h1>To get the width of the building this method is used.</h1>
     *
     * @return {@link Integer} width of the building.
     */
    public int getWidth() {
        return width;
    }

    /**
     * <h1>Sets the width of the building.</h1>
     * <p>Although this meant to be private but for logic tests it has to be public</p>
     * <p>That is why I have given it public access modifier.</p>
     *
     * @param width {@link Integer} of the building.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * <h1>To get the lotLength of the building this method is used.</h1>
     *
     * @return {@link Integer} lotLength of the building.
     */
    public int getLotLength() {
        return lotLength;
    }

    /**
     * <h1>Sets the lotLength of the building.</h1>
     * <p>Although this meant to be private but for logic tests it has to be public</p>
     * <p>That is why I have given it public access modifier.</p>
     *
     * @param lotLength {@link Integer} of the building.
     */
    public void setLotLength(int lotLength) {
        this.lotLength = lotLength;
    }

    /**
     * <h1>To get the lotWidth of the building this method is used.</h1>
     *
     * @return {@link Integer} lotWidth of the building.
     */
    public int getLotWidth() {
        return lotWidth;
    }

    /**
     * <h1>Sets the lotWidth of the building.</h1>
     * <p>Although this meant to be private but for logic tests it has to be public</p>
     * <p>That is why I have given it public access modifier.</p>
     *
     * @param lotWidth {@link Integer} of the building.
     */
    public void setLotWidth(int lotWidth) {
        this.lotWidth = lotWidth;
    }

    /**
     * <h1>Calculates the total area of the building</h1>
     * <p>To calculate the total are of the building this method can be used.</p>
     *
     * @return {@link Integer} area of the building
     */
    public int calcBuildingArea() {
        return length * width;
    }

    /**
     * <h1>Calculates the total lot area of the building</h1>
     * <p>To calculate the total are of the building this method can be used.</p>
     *
     * @return {@link Integer} lotArea of the building
     */
    public int calcLotArea() {
        return lotLength * lotWidth;
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
     * <h1>Checks the equality of the two building object.</h1>
     *
     * @param o {@link Object} building object can be passed to this method.
     * @return {@link Boolean} true if the area of two building is equals false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (Building.class.isInstance(o)) {
            Building other = (Building) o;
            return (this.calcBuildingArea() == other.calcBuildingArea());
        }
        return false;
    }
}
