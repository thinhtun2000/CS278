package lab10;

import java.util.Scanner;

public class Lab10 {
	
	public static int respond(int a, int b) {
		
		int correct = 0;
		int incorrect = 0;
		int[] array1 = new int[4];
		int[] array2 = new int[4];
		
		for (int i = 0; i < 4; i++) {
			array1[i] = a % 10;
			a = a / 10;
		}
		for (int i = 0; i < 4; i++) {
			array2[i] = b % 10;
			b = b / 10;
		}
		
		// Check for perfect match
		for (int i = 0; i < 4; i++) {
			if (array1[i] == array2[i]) {
				array1[i] = 0;
				array2[i] = 0;
				correct++;
			}
		}
		
		// Check for incorrect position
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (array1[i] == array2[j] && i != j && array1[i] != 0) {
					array1[i] = 0;
					array2[j] = 0;
					incorrect++;
				}
			}
		}
		
		return correct * 10 + incorrect;
		
	}
	
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter 4-digit code: ");
		int code = scnr.nextInt();
		System.out.print("Please enter a guess or 0 to stop: ");
		int input = scnr.nextInt();
		
		while (input != 0) {
			System.out.println("Response is " + respond(code, input));
			System.out.print("Please enter a guess or 0 to stop: ");
			input = scnr.nextInt();
			if (input == 0) {
				System.out.println("Bye");
				break;
			}
		}
		
		
		
		
	}
	
}
