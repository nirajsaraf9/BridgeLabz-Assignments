package lineequalitycheck;

public class LineEqualityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter the coordinates of the first line:");   // Input: Coordinates of two points for the first line
        System.out.print("x1: ");
        double x1a = scanner.nextDouble();
        System.out.print("y1: ");
        double y1a = scanner.nextDouble();
        System.out.print("x2: ");
        double x2a = scanner.nextDouble();
        System.out.print("y2: ");
        double y2a = scanner.nextDouble();

        
        System.out.println("\nEnter the coordinates of the second line:");  // Input: Coordinates of two points for the second line
        System.out.print("x1: ");
        double x1b = scanner.nextDouble();
        System.out.print("y1: ");
        double y1b = scanner.nextDouble();
        System.out.print("x2: ");
        double x2b = scanner.nextDouble();
        System.out.print("y2: ");
        double y2b = scanner.nextDouble();

        scanner.close();

     
        Line line1 = new Line(x1a, y1a, x2a, y2a);       // Create Line objects
        Line line2 = new Line(x1b, y1b, x2b, y2b);

       
        if (line1.equals(line2))    // Check equality and print the result
          {
            System.out.println("The lines are equal.");
        } else {
            System.out.println("The lines are not equal.");
        }
    }
}