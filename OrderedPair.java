
/**
 * Write a description of class OrderedPairClass here.
 *
 * @author (Julian Ryan)
 * @version (09/21/23)
 */
public class OrderedPair {
    // instance variables
    double x;
    double y;
    String pair;

    public OrderedPair(){
        x = 0;
        y = 0;
    }

    public OrderedPair(double xIn, double yIn) {
        x = xIn;
        y = yIn;
    }

    public String toString() {
        String pair = x + ", " + y;
        return pair;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
 