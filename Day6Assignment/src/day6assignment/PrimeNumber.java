package day6assignment;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number to check for being a prime number
        System.out.print("Enter a number to check for being a prime number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (isPrime(number))        // Check if the number is a prime number

        {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

  
    private static boolean isPrime(int num)    // Function to check if a number is a prime number
    {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++)    // Check for divisibility from 2 to the square root of the number

        {
            if (num % i == 0) {
                return false; // Not a prime number if divisible
            }
        }

        return true; // If not divisible by any number, it is a prime number
    }
}
