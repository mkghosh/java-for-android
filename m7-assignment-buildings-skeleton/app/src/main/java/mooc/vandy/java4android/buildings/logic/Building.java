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

    private void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    private void setWidth(int width) {
        this.width = width;
    }

    public int getLotLength() {
        return lotLength;
    }

    private void setLotLength(int lotLength) {
        this.lotLength = lotLength;
    }

    public int getLotWidth() {
        return lotWidth;
    }

    private void setLotWidth(int lotWidth) {
        this.lotWidth = lotWidth;
    }

    public int calcBuildingArea() {
        return 0;
    }

    public int calcLotArea() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
