package day6assignment;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CouponNumbers {

    public static void main(String[] args) {
      
        int[] couponNumbers = {1, 2, 3, 4, 5}; // Replace with your distinct coupon numbers

        
        int totalRandomNumbers = generateDistinctCoupons(couponNumbers);    // Output: Total random numbers needed to have all distinct numbers
        System.out.println("Total random numbers needed: " + totalRandomNumbers);
    }

    private static int generateDistinctCoupons(int[] couponNumbers)    // Function to generate random numbers
    {
        Set<Integer> distinctCoupons = new HashSet<>();
        Random random = new Random();
        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < couponNumbers.length) {
            int randomCoupon = generateRandomCoupon(random);
            totalRandomNumbers++;

            if (distinctCoupons.add(randomCoupon)) {
                System.out.println("Generated Coupon: " + randomCoupon);
            }
        }

        return totalRandomNumbers;
    }

    private static int generateRandomCoupon(Random random)      // Function to generate a random coupon
    {
    
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }
}
