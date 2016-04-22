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
    }
    public House(int	length,	int	width,	int	lotLength,	int	lotWidth,	String	owner, boolean pool) {
        this(length,width,lotLength,lotWidth);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
