import java.util.Scanner;

/**
 * @author Natasya Virgichalia.
 * Date: 09/17/2017.
 * CSC 201-004N.
 * Professor Tanes Kanchanawanchai.
 * Assignment 7.25
 * This program solves quadratic equations using the input given by the user for the coefficients of a quadratic equation ax^2 + bx + c = 0.
 * It returns and displays the number of real roots.
 */
public class quadraticEq {
    public static void main(String [] agrs) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter values for a, b, and c");

        //initialize an array for a, b, and c used in the quadratic equation
        double [] eqn = new double[3];
        //initialize an array to store all the real roots found
        double [] roots = new double[2];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = keyboard.nextDouble();
        }
        int realRoots = solveQuadratic(eqn, roots);
        if(realRoots == 0) {
            System.exit(0);
        }
        displayRoots(roots, realRoots);
    }

    /**
     * This method uses the quadratic equation to find the real roots with input of a, b, and c from the user.
     * The coefficients of a quadratic equation ax^2 + bx + c = 0 are passed to the array eqn and the real roots are stored in roots.
     * @param eqn an array of 3 numbers input by the user for a, b, and c.
     * @param roots an array that will store all the real roots found by the quadratic equation.
     * @return the method returns the number of real roots of 2, 1 or no real roots.
     */
    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn [0];
        double b = eqn [1];
        double c = eqn [2];
        double root = b*b - 4.0*a*c;
        if (root > 0.0) {
            roots[0] = ((-b) + Math.pow(root, 0.5)) / (2 * a);
            roots[1] = ((-b) - Math.pow(root, 0.5)) / (2 * a);
            System.out.println("The equation has two roots");
            return 2;
        } else if (root == 0) {
            roots[0] = ((-b) + Math.pow(root, 0.5)) / (2 * a);
            System.out.println("The equation has one root");
            return 1;
        } else {
            System.out.println("The equation has no real roots");
            return 0;
        }
    }

    /**
     * This method prints out the number of real roots and the all the real roots.
     * @param roots the roots solved with the quadratic equation.
     * @param realRoots the number of real roots.
     */
    public static void displayRoots(double[] roots,int realRoots) {
        for (int i = 0; i < realRoots; i++) {
            System.out.println(roots[i] + " ");
        }
    }
}
