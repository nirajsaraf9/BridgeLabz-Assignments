package assignment5;

import java.util.Scanner;

public class CoinFlipPercentage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of times to flip the coin: ");
        int numberOfFlips = scanner.nextInt();

        
        if (numberOfFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }

        scanner.close();

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < numberOfFlips; i++) {
           
            double randomValue = Math.random();

            
            if (randomValue < 0.5) {							// If < 0.5, consider it as tails; otherwise, consider it as heads
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        
        double headsPercentage = (headsCount * 100.0) / numberOfFlips;  // Calculate percentages
        double tailsPercentage = (tailsCount * 100.0) / numberOfFlips;

      
        System.out.println("Percentage of Heads: " + headsPercentage + "%");
        System.out.println("Percentage of Tails: " + tailsPercentage + "%");
    }
}
