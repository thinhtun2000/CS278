package lab5;

import java.util.Scanner;

public class Programm {
	
	public static String convertToBinary (int array[], int n) {
		String x = "";
		while (x.length() < array.length) {
			if (n == 0)
				x = "0" + x;
			while(n > 0) {
	            int a = n % 2;
	            x = a + "" + x;
	            n = n / 2;
	        }
		}
		return x;
	}
	
	public static void generateMasksAndCheckTheSum (int array[], int N) {
		int n = array.length;
		for (int i = 0; i < Math.pow(2, n); i++) {
			int sum = 0;
			String s = convertToBinary(array, i);
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == '1')
					sum += array[j];
			}
			if (sum == N) {
				System.out.print("{ ");
				for (int j = 0; j < n; j++) {
					if (s.charAt(j) == '1')
						System.out.print(array[j] + " ");
				}
				System.out.println("}");
			}
		}
	}
	
	public static int theNumberOfSubsets (int array[], int N) {
		int n = array.length;
		int count = 0;
		for (int i = 0; i < Math.pow(2, n); i++) {
			int sum = 0;
			String s = convertToBinary(array, i);
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == '1')
					sum += array[j];
			}
			if (sum == N)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		// Create variables
		int setSize = 0;
		Scanner scnr = new Scanner(System.in);
		
		// Print a prompt 
		System.out.print("Please enter the size of S: ");
		
		// Get the size input and create an array of that size
		setSize = scnr.nextInt();
		int set[] = new int[setSize];
		
		// Print a prompt
		System.out.print("Please enter S: ");
		
		// Get the elements of S
		for (int i = 0; i < setSize; i++)
			set[i] = scnr.nextInt();
		
		// Print a prompt
		System.out.print("Please enter N: ");
		
		// Get N
		int N = scnr.nextInt();
		
		// Print a prompt
		System.out.println("Subsets with sum " + N + ": ");
		
		// Print out the subsets with the sum N
		generateMasksAndCheckTheSum(set, N);
		System.out.println( "There are " + theNumberOfSubsets(set, N) + " subsets with sum " + N +".");
	}
}
