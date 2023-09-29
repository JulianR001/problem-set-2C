
/**
 * Write a description of class Formula_Driver here.
 *
 * @author (Julian Ryan)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FormulaDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();

        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for "+ a +"x^2 + "+ b +"x + "+ c +" are " + roots);

    }

    public static void MySlope(String[] args){

        Scanner input = new Scanner(System.in); 
        System.out.println("SLOPE FORMULA: Find Slope m = (y2 - y1)/(x2 - x1)  for the line between points (x1,y1) and (x2,y2)");
        System.out.println("Enter x1:");
        double a = input.nextDouble();
        System.out.println("Enter y1:");
        double b = input.nextDouble();
        System.out.println("Enter x2:");
        double c = input.nextDouble();
        System.out.println("Enter y2:");
        double d = input.nextDouble();
        OrderedPair pV1 = new OrderedPair(a,b);
        OrderedPair pV2 = new OrderedPair(c,d);
        double slope = Formulas.slope(pV1,pV2);
        System.out.println("the answer is " + slope);
    }

    public static void FindMidpoint(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("FindMidpoint = ((x1 + x2)/2), ((y1 + y2)/2)");
        System.out.println("x1:");
        double a = input.nextDouble();
        System.out.println("y1:");
        double b = input.nextDouble();
        System.out.println("x2:");
        double c = input.nextDouble();
        System.out.println("y2:");
        double d = input.nextDouble();
        OrderedPair P1 = new OrderedPair(a, b);
        OrderedPair P2 = new OrderedPair(c, d);
        OrderedPair MidPoint = Formulas.findMidpoint(P1, P2);
        System.out.print("The midpoint for " + "(" + P1 + ")" + " and (" + P2 + ") is (" + MidPoint + ")");

    }

    public static void ArithmeticSeries(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Find the sum of an arithmetic series");
        System.out.print("k:");
        int k = input.nextInt();
        System.out.print("a:");
        double a = input.nextDouble();
        System.out.print("b:");
        double b = input.nextDouble();
        double sum = Formulas.findArithmeticSeriesSum(a, b, k);
        System.out.print("The sum of the first (" + k + ") terms of an arithmetic series that starts with (" + a + ") and increases by (" + b + ") is " + sum);
    }

    public static void GeometricSeries(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Find the sum of an Geometric series");
        System.out.print("k:");
        int k = input.nextInt();
        System.out.print("a:");
        double a = input.nextDouble();
        System.out.print("r:");
        double r = input.nextDouble();
        double sum = Formulas.findGeometricSeriesSum(a, r, k);
        System.out.print("The sum of the first (" + k + ") terms of an Geometric series that starts with (" + a + ") and multiplies by (" + r + ") is " + sum);
    }

    public static void DiceRoll(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("input the number of sides on the dice");
        System.out.print("S:");
        int S = input.nextInt();
        int roll = Formulas.rollDie(S);
        System.out.print("The number you rolled was " + roll);
    }
}
