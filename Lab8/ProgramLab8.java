package lab8;

import java.util.Scanner;

public class ProgramLab8 {
	
	public static int cycleLength(int a, int b, int c, int M) {
		int slow = 0;
		int fast = 0;
		int length = 1;
		int[] array = new int[100001];
		int x = c;
		for (int i = 0; i < array.length; i++) {
			array[i] = x;
			x = (x * a + b) % M;
		}
		while (slow < 100000 && fast < 100000) {
			if (array[slow] == array[fast] && slow != 0)
				break;
			slow++;
			fast += 2;
		}
		for (int i = fast - 1; i > 0; i--) {
			if (array[fast] == array[i]) {
				break;
			}
			length++;
		}
		
		return length;
	}
	
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter values of a, b, c, and M in this order: ");
		
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		int c = scnr.nextInt();
		int M = scnr.nextInt();
		
		System.out.println("The first 100 elements of the sequence: ");
		
		int x = c;
		for (int i = 0; i < 100; i++) {
			System.out.print( x + "  " );
			x = (a * x + b) % M;
			if (i != 0 && i % 10 == 9)
				System.out.println();
		}
		
		System.out.println("\nCycle length is " + cycleLength(a, b, c, M));
		
		
	}
}
