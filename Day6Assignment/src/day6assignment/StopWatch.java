package day6assignment;

import java.util.Scanner;

public class Stopwatch {

    private long startTime;
    private long endTime;

    
    public void start()   // Method to start the stopwatch
    {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started. Press Enter to stop.");
    }

  
    public void stop()    // Method to stop the stopwatch
    {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped.");
    }

    
    public void printElapsedTime()  // Method to calculate and print the  time
    {
        if (startTime == 0 || endTime == 0) {
            System.out.println("Please start and stop the stopwatch first.");
        } else {
            long elapsedTime = endTime - startTime;
            System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
        }
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Press Enter to start the stopwatch.");
        scanner.nextLine();
        stopwatch.start();

        
        System.out.println("Press Enter to stop the stopwatch.");
        scanner.nextLine();
        stopwatch.stop();

        
        stopwatch.printElapsedTime();

        scanner.close();
    }
}
