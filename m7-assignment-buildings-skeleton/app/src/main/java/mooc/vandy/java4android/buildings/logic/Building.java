package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    private int length;
    private int width;
    private int lotLength;
    private int lotWidth;

    public Building(int	length, int	width, int	lotLength, int	lotWidth) {
        setLength(length);
        setWidth(width);
        setLotLength(lotLength);
        setLotWidth(lotWidth);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLotLength() {
        return lotLength;
    }

    public void setLotLength(int lotLength) {
        this.lotLength = lotLength;
    }

    public int getLotWidth() {
        return lotWidth;
    }

    public void setLotWidth(int lotWidth) {
        this.lotWidth = lotWidth;
    }

    public int calcBuildingArea() {
        return getLength() * getWidth();
    }

    public int calcLotArea() {
        return getLotLength() * getLotWidth();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        Building other = (Building) o;
        return (this.calcBuildingArea() == other.calcBuildingArea());
    }
}
