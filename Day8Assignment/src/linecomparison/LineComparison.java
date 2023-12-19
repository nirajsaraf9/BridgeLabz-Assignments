package linecomparison;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the coordinates of the first line:");    // Input: Coordinates of two points for the first line
        System.out.print("x1: ");
        double x1a = scanner.nextDouble();
        System.out.print("y1: ");
        double y1a = scanner.nextDouble();
        System.out.print("x2: ");
        double x2a = scanner.nextDouble();
        System.out.print("y2: ");
        double y2a = scanner.nextDouble();

       
        System.out.println("\nEnter the coordinates of the second line:");    // Input: Coordinates of two points for the second line
        System.out.print("x1: ");
        double x1b = scanner.nextDouble();
        System.out.print("y1: ");
        double y1b = scanner.nextDouble();
        System.out.print("x2: ");
        double x2b = scanner.nextDouble();
        System.out.print("y2: ");
        double y2b = scanner.nextDouble();

        scanner.close();

       
        Line line1 = new Line(x1a, y1a, x2a, y2a);    // Create Line objects
        Line line2 = new Line(x1b, y1b, x2b, y2b);

       
        int comparisonResult = line1.compareTo(line2);    // Compare lines and print the result
        if (comparisonResult < 0) {
            System.out.println("The first line is shorter than the second line.");
        } else if (comparisonResult > 0) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The lines are equal in length and endpoints.");
        }
    }
}