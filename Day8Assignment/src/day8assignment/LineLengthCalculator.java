package day8assignment;

import java.util.Scanner;

public class LineLengthCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the x-coordinate of the first point: ");     // Input: Coordinates of two points (x1, y1) and (x2, y2)
        double x1 = scanner.nextDouble();

        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = scanner.nextDouble();

        scanner.close();

       
        Line line = new Line(x1, y1, x2, y2);  // // Create  object

        double length = line.calculateLength();    // Calculate and print the length of the line

        System.out.println("Length of the line: " + length);
    }
}
