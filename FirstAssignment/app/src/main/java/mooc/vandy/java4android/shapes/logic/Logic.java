package mooc.vandy.java4android.shapes.logic;

import mooc.vandy.java4android.shapes.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 *
 */
public class Logic 
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = 
        Logic.class.getName();

    /*
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough)
     */
    private OutputInterface mOut;

    /**
     * These are the numeric values that you will receive from the
     * User Interface and use in your calculations.
     */
    private static double mRadius = 0;
    private static double mLength = 0;
    private static double mWidth = 0;
    private static double mHeight = 0;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance
     * (which implements [OutputInterface]) to 'out'
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    @Override
    public void process() {
        // Get which calculation should be computed.  Do not worry
        // about the specifics of this right now.
        Shapes shapeForCalculations = mOut.getShape();

        // Store the values returned by the User Interface.
        mLength = mOut.getLength();
        mWidth = mOut.getWidth();
        mHeight = mOut.getHeight();
        mRadius = mOut.getRadius();

        // Determine which calculation to process right now.  Again,
        // do not worry about the specifics of how this works for now.
        switch (shapeForCalculations) {
            case Box:
                mOut.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " by " 
                           + mHeight 
                           + " box has a volume of: ");
                mOut.println("" 
                             + String.format("%.2f",
                                             boxVolume(mLength, mWidth, mHeight)));
                mOut.println("");

                mOut.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " by " 
                           + mHeight 
                           + " box has a surface area of: ");
                mOut.println("" 
                             + String.format("%.2f",
                                             boxSurfaceArea(mLength, mWidth, mHeight)));
                mOut.println("");
                // If you are paying attention, you will notice that
                // there is no 'break;' here like there is in other
                // places, meaning that if 'Box' was selected, it will
                // run the two sets of print statements above and the
                // two statements below until the 'break;' statement.
            case Rectangle:
                mOut.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " rectangle has a perimeter of: ");
                mOut.println("" + String.format("%.2f", 
                                                rectanglePerimeter(mLength, mWidth)));
                mOut.println("");

                mOut.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " rectangle has area of: ");
                mOut.println("" + String.format("%.2f", rectangleArea(mLength, mWidth)));
                mOut.println("");
                break;
            case Sphere:
                mOut.print("A sphere with radius " + mRadius + " has a volume of: ");
                mOut.println("" + String.format("%.2f", sphereVolume(mRadius)));
                mOut.println("");

                mOut.print("A sphere with radius " + mRadius + " has surface area of: ");
                mOut.println("" + String.format("%.2f", sphereSurfaceArea(mRadius)));
                mOut.println("");
                // Same here as with 'Box' above. If 'Sphere' is picked, it will run the
                // two sets of print statements above and the two below until the 'break;'
            case Circle:
                mOut.print("A circle with radius " + mRadius + " has a perimeter of: ");
                mOut.println("" + String.format("%.2f", circleCircumference(mRadius)));
                mOut.println("");

                mOut.print("A circle with radius " + mRadius + " has area of: ");
                mOut.println("" + String.format("%.2f", circleArea(mRadius)) );
                mOut.println("");
                break;
            case Triangle:
                mOut.print("A right triangle with base " 
                           + mLength 
                           + " and height " 
                           + mWidth + " has a perimeter of: ");
                mOut.println("" 
                             + String.format("%.2f", rightTrianglePerimeter(mLength,
                                                                       mWidth)));
                mOut.println("");

                mOut.print("A right triangle with base " 
                           + mLength 
                           + " and height " 
                           + mWidth 
                           + " has area of: ");
                mOut.println("" 
                             + String.format("%.2f", rightTriangleArea(mLength,
                        mWidth)));
                mOut.println("");
                break;
            default:
                break;
        }
    }

    // TODO -- add your code here
    /**
     * <h1>This method is used to determine the area of a rectangle.</h1>
     * <p>This method will take two parameters the first one is the length of the rectangle</p>
     * <p> and second one is the width of the rectangle.</p>
     * @param length {@link Double} length of the rectangle whose area to be calculated.
     * @param width {@link Double} width of the rectangle whose area to be calculated.
     * @return {@link Double} the area of the rectangle.
     */
    @Contract(pure = true)
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    /**
     * <h1>This method is used to determine the perimeter of a rectangle.</h1>
     * <p>This method will take two parameters the first one is the length of the rectangle</p>
     * <p> and second one is the width of the rectangle.</p>
     * @param length {@link Double} length of the rectangle whose perimeter to be calculated.
     * @param width {@link Double} width of the rectangle whose perimeter to be calculated.
     * @return {@link Double} the perimeter of the rectangle.
     */
    @Contract(pure = true)
    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    /**
     * <h1>This method is used to calculate the Area of a Circle</h1>
     * <p>This method takes the radius of the Circle and returns the area occupied by the Circle.</p>
     * @param radius {@link Double} radius of the circle whose are is to be calculated.
     * @return {@link Double} Area of the circle
     */
    @Contract(pure = true)
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * <h1>This method is used to calculate the Circumference of a Circle</h1>
     * <p>This method takes the radius of the Circle and returns the Circumference of the Circle.</p>
     * @param radius {@link Double} radius of the circle.
     * @return {@link Double} Circumference of the circle
     */
    @Contract(pure = true)
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * <h1>This method is used to calculate the Area of a Right Angled Triangle</h1>
     * <p>This method takes two parameter. The first one is the base of the Right Angled Triangle </p>
     * <p>and the second one is the height of the Triangle. And returns the area of the Triangle</p>
     * @param base {@link Double} the base of the Right Angled Triangle.
     * @param height {@link Double} the height of the Right Angled Triangle.
     * @return {@link Double} the Area of the Right Angled Triangle.
     */
    @Contract(pure = true)
    public static double rightTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    /**
     * <h1>This method is used to calculate the Perimeter of a Right Angled Triangle</h1>
     * <p>This method takes two parameter. The first one is the base of the Right Angled Triangle </p>
     * <p>and the second one is the height of the Triangle. And returns the perimeter of the Triangle</p>
     * @param base {@link Double} the base of the Right Angled Triangle.
     * @param height {@link Double} the height of the Right Angled Triangle.
     * @return {@link Double} the Perimeter of the Right Angled Triangle.
     */
    @Contract(pure = true)
    public static double rightTrianglePerimeter(double base, double height) {

        //calculates the hypotenuse of the right angled triangle.
        double hypotenuse = (Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)));

        //The perimeter of any triangle is the addition of the 3 arm.
        return base + height + hypotenuse;
    }

    /**
     * <h1>This method is used to calculate the Volume of a Box</h1>
     * <p>Box is also called rectangular parallelepiped or right rectangular prism</p>
     * <p>This method takes three arguments. The arguments are length, width and depth/height of the Box.</p>
     * @param length {@link Double} The length of the Box.
     * @param width {@link Double} The width of the Box.
     * @param depth {@link Double} The depth or height of the Box.
     * @return {@link Double} The volume of the Box.
     */
    @Contract(pure = true)
    public static double boxVolume(double length, double width, double depth) {
        return length * width * depth;
    }

    /**
     * <h1>This method is used to calculate the Surface Area of a Box</h1>
     * <p>Box is also called rectangular parallelepiped or right rectangular prism</p>
     * <p>This method takes three arguments. The arguments are length, width and depth/height of the Box.</p>
     * @param length {@link Double} The length of the Box.
     * @param width {@link Double} The width of the Box.
     * @param depth {@link Double} The depth or height of the Box.
     * @return {@link Double} The Surface Area of the Box.
     */
    @Contract(pure = true)
    public static double boxSurfaceArea(double length, double width,
                                        double depth) {
        return 2 * depth * (length + width);
    }
}
