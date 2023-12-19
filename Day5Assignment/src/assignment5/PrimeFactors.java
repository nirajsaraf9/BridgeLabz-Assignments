package assignment5;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int N = scanner.nextInt();

 
        if (N <= 1) {
            System.out.println("Please enter a number greater than 1.");
            return;
        }

        scanner.close();

      
        System.out.print("Prime factors of " + N + ": ");     // print prime factors of N
        computePrimeFactors(N);
    }

    private static void computePrimeFactors(int num) {
       
        while (num % 2 == 0)     // Print the number of 2s that divide num
         {
            System.out.print("2 ");
            num /= 2;
        }

        
        for (int i = 3; i * i <= num; i += 2)        // num must be odd at this point
        {   
            
            while (num % i == 0)   // While i divides num, print i and divide num
            {
                System.out.print(i + " ");
                num /= i;
            }
        }

  
        if (num > 2)      // If num is a prime number greater than 2
        {
            System.out.print(num);
        }
    }
}
