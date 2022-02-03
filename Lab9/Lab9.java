package lab9;

import java.util.Scanner;

public class Lab9 {
	
	public static int sum1 (int n) {
		// Base case
		if( n == 0 )
			return 1;
		else
			// Recursive step
			return sum1 (n - 1) + (int) Math.pow(2, n);
	}
	
	public static int sum2 (int n) {
		// Base case
		if( n == 1 )
			return 2;
		else
			// Recursive step
			return n*(n + 1) + sum2(n - 1);
	}
	
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter the value of n: ");
		int n = scnr.nextInt();
		System.out.println("The value of the 1st summation is " + sum1(n));
		System.out.println("The value of the 2nd summation is " + sum2(n));
	}
	
	
}
