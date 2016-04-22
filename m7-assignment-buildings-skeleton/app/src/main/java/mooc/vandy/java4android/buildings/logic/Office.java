package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
    /**businessName	:	String
     - parkingSpaces:	int
     - totalOffices:	int	//static	variable**/
    private String businessName;
    private int parkingSpaces;
    private static int totalOffices = 0;

    public Office(int	length,	int	width,	int	lotLength,	int	lotWidth) {
        super(length,width,lotLength,lotWidth);
        totalOffices++;
    }

    public Office(int	length,	int	width,	int	lotLength,	int	lotWidth,	String	businessName) {
        this(length, width, lotLength, lotWidth);
        this.businessName = businessName;
    }

    public Office(int	length,	int	width,	int	lotLength,	int	lotWidth,	String	businessName,
                  int	parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);
        this.parkingSpaces = parkingSpaces;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public static int getTotalOffices() {
        return totalOffices;
    }

    public static void setTotalOffices(int totalOffices) {
        Office.totalOffices = totalOffices;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Business: ");
        if(getBusinessName() != null) {
            sb.append(getBusinessName() + " (total offices: " + getTotalOffices() + ")");
        } else {
            sb.append("unoccupied (total offices: " + getTotalOffices() + ")");
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object officeObject) {
        Office otherOffice = (Office) officeObject;
        return (getParkingSpaces() == otherOffice.getParkingSpaces()) && super.equals(otherOffice);
    }
}
