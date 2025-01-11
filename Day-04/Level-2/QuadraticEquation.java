import java.util.Scanner;
public class QuadraticEquation {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{};  // No real roots
        }
    }

    public static void main(String[] args) {

        //create an instance of scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients a, b, and c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }

        //closing scanner
        scanner.close();
    }
}
