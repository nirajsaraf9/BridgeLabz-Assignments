package assignment5;

import java.util.Scanner;

public class LeapYear {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter Year to check Leap or Non-Leap");
		Scanner sc =new Scanner(System.in);
		 year=sc.nextInt();

	   
	    if (year % 4 == 0) {

	      
	      if (year % 100 == 0) {

	        
	        if (year % 400 == 0)
	          
	        System.out.println("It is a leap Year");
	        else
	        	System.out.println("Not a leap");
	         
	        
	      }
	      
	      // if the year is not century
	      
	       
	    }
	   
		
	}

}
