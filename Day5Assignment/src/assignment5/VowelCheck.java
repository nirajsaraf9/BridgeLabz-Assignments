package assignment5;

import java.util.Scanner;

public class VowelCheck {

	private static final char a = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='i';
		System.out.println("Enter any character from A to Z");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		switch (ch) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System. out.println(ch +" is vowel"); 
		break;
		default:
		System. out.println(ch+" is consonant ");

}
	}
	}
	
