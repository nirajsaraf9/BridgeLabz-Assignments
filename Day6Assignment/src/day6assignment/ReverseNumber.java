package day6assignment;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a number to be reversed: ");     // Input: Number to be reversed
        int number = scanner.nextInt();

        scanner.close();

       
        int reversedNumber = reverseNumber(number);    // Reverse the number

     
        System.out.println("Reversed number: " + reversedNumber);     // Output: Print the reversed number
    }

   
    private static int reverseNumber(int num)  // Function to reverse a number using a while loop
    {
        int reversedNum = 0;

        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return reversedNum;
    }
}
