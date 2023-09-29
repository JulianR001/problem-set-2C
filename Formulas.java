
/**
 * Proble set 2C
 *
 * @author (Julian Ryan)
 * @version (23/09/27)
 */
public class Formulas {
    public Formulas() {
        double x =0;
    }

    public static OrderedPair findQuadraticRoots (double a, double b, double c) {
        double x1 = (-b + Math.sqrt((b*b) - (4.0*a*c)) ) / (2.0*a);
        double x2 = (-b - Math.sqrt((b*b) - (4.0*a*c)) ) / (2.0*a);

        OrderedPair Answer = new OrderedPair(x1, x2);
        return Answer;
    }

    public static double slope(OrderedPair a, OrderedPair b){
        double x = (a.getX() - b.getX());
        double y = (a.getY() - b.getY());
        double answer = y/x;
        return answer;
    }

    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        double Mx = (A.getX() + B.getX())/2;
        double My = (A.getY() + B.getY())/2;
        OrderedPair Answer = new OrderedPair(Mx, My);
        return Answer;

    }

    public static double findArithmeticSeriesSum (double a, double d, int k) {
        double Answer = (k*a) + (d*(k-1)*k)/2;
        return Answer;
    }

    public static double findGeometricSeriesSum (double a, double r, int k) {
        double answer = a*(1-(Math.pow(r, k)))/(1-r);
        return answer;

    }
    public static int rollDie (int sides) {
        double roll = (Math.random())*sides + 1;
        int answer = (int) roll;
        return answer;
    }

}

