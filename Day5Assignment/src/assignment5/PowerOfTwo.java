package assignment5;

public class PowerOfTwo {

    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Usage: java PowerOfTwo <N>");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N < 0 || N >= 31) {
            System.out.println("N should be in the range 0 to 30 (inclusive).");
            return;
        }

        System.out.println("Powers of 2 less than or equal to 2^" + N + ":");     // Print the table of powers of 2
        for (int i = 0; i <= N; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}

