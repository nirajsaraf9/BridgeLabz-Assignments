package assignment5;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the Harmonic Value N (ensure N != 0): ");   // Input: The Harmonic Value N
        int N = scanner.nextInt();

       
        if (N == 0) {
            System.out.println("N should be a non-zero value.");    // // Validate input
            return;
        }

        scanner.close();

        double harmonicNumber = 0.0;      // calculate and print the Nth harmonic number

        for (int i = 1; i <= N; i++) {
            harmonicNumber += 1.0 / i;
        }

        System.out.println("The Nth Harmonic Value: " + harmonicNumber);
    }
}
