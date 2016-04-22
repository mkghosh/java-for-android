package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {

    private String owner;
    private boolean pool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    public House(int	length,	int	width,	int	lotLength,	int	lotWidth,	String	owner) {
        this(length,width,lotLength,lotWidth);
        this.owner = owner;
    }

    public House(int	length,	int	width,	int	lotLength,	int	lotWidth,	String	owner, boolean pool) {
        this(length,width,lotLength,lotWidth,owner);
        this.pool = pool;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean hasPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Owner: " + this.getOwner() + "; ");
        if(this.calcBuildingArea() < this.calcLotArea())
            sb.append("has a big open space");
        else
            sb.append("has no open space at all");
        return sb.toString();
    }

    @Override
    public boolean equals(Object houseObject) {
        House otherHouse = (House) houseObject;
        return (this.hasPool() == otherHouse.hasPool()) && super.equals(otherHouse);
    }
}
