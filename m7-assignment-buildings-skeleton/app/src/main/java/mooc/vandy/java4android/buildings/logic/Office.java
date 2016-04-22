package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
        extends Building {

    //instance variables
    private String businessName;
    private int parkingSpaces;

    //static variable to keep track of the number of unique instances created.
    private static int totalOffices = 0;

    /**
     * <h1>Public constructor to match with the super class constructor</h1>
     * <p>It will handles the super constructor calling.</p>
     *
     * @param length    {@link Integer} of the office.
     * @param width     {@link Integer} of the office.
     * @param lotLength {@link Integer} of the office.
     * @param lotWidth  {@link Integer} of the office.
     */
    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        totalOffices++;
    }

    /**
     * <h1>Overloaded constructor to add extra field business name.</h1>
     *
     * @param length       {@link Integer} of the office.
     * @param width        {@link Integer} of the office.
     * @param lotLength    {@link Integer} of the office.
     * @param lotWidth     {@link Integer} of the office.
     * @param businessName {@link String} the office occupied by.
     */
    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        this(length, width, lotLength, lotWidth);
        this.businessName = businessName;
    }

    /**
     * <h1>Overloaded constructor to add yet another extra field.</h1>
     *
     * @param length        {@link Integer} of the office.
     * @param width         {@link Integer} of the office.
     * @param lotLength     {@link Integer} of the office.
     * @param lotWidth      {@link Integer} of the office.
     * @param businessName  {@link Integer} the office occupied by.
     * @param parkingSpaces {@link Integer} the office has.
     */
    public Office(int length, int width, int lotLength, int lotWidth, String businessName,
                  int parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);
        this.parkingSpaces = parkingSpaces;
    }

    /**
     * <h1>Getter of the business name the office occupied by.</h1>
     *
     * @return {@link String} the office occupied by.
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * <h1>Sets the business name</h1>
     *
     * @param businessName {@link String} the office occupied by.
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * <h1>Getter for the parking space.</h1>
     *
     * @return {@link Integer} parking space of the office
     */
    public int getParkingSpaces() {
        return parkingSpaces;
    }

    /**
     * <h1>Sets the parking space</h1>
     *
     * @param parkingSpaces {@link Integer} parking space of the office.
     */
    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public static int getTotalOffices() {
        return totalOffices;
    }

    public static void setTotalOffices(int totalOffices) {
        Office.totalOffices = totalOffices;
    }

    /**
     * <h1>Overriden toString method to show the status of the {@link Office}</h1>
     *
     * @return {@link String} representation of {@link Office}.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Business: ");
        if (getBusinessName() != null) {
            sb.append(getBusinessName() + " (total offices: " + getTotalOffices() + ")");
        } else {
            sb.append("unoccupied (total offices: " + getTotalOffices() + ")");
        }

        return sb.toString();
    }

    /**
     * <h1>Overriden equals method to check the equality of two {@link Office}</h1>
     *
     * @param officeObject {@link Object} Office objects can be checked whether it is equals or not.
     * @return {@link Boolean} true if equals or false.
     */
    @Override
    public boolean equals(Object officeObject) {
        if (Office.class.isInstance(officeObject)) {
            Office otherOffice = (Office) officeObject;
            return (parkingSpaces == otherOffice.parkingSpaces) && super.equals(otherOffice);
        }
        return false;
    }
}
