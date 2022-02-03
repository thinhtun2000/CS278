package lab11;

import java.util.Scanner;

public class Program {

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
	
	public static void generation(int[] array) {
		int i = 0;
		for (int i1 = 1; i1 <= 6; i1++) {
			for (int i2 = 1; i2 <= 6; i2++) {
				for (int i3 = 1; i3 <= 6; i3++) {
					for (int i4 = 1; i4 <= 6; i4++) {
						array[i] = i1*1000 + i2*100 + i3*10 + i4;
						i++;
					}
				}
			}
		}
	}
	
	public static int sizePossible(boolean[] possible) {
		int count = 0;
		for (int i = 0; i < possible.length; i++) {
			if (possible[i])
				count++;
		}
		return count;
	}
	
	
	public static void main(String [] args) {
		
		// Generate the mask
		int[] array = new int[1296];
		generation(array);
		
		// Mark all of them as possible
		boolean[] possible = new boolean[1296];
		for (int i = 0; i < 1296; i++) {
			possible[i] = true;
		}
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please think of a 4-digit code and let me guess it.");
		int guess = array[(int) Math.random() * array.length];
		System.out.println("There are 1296 possible sequences. I am guessing " + guess);
		System.out.print("Please enter your response: ");
		int response = scnr.nextInt();
		
		while (response != 40 && sizePossible(possible) > 0) {
			for (int i = 0; i < array.length; i++) {
				if (possible[i] && respond(array[i], guess) != response)
					possible[i] = false;
			}
			System.out.print(sizePossible(possible) + " possible sequences are remaining. ");
			if (sizePossible(possible) == 0)
				break;
			int idx = (int) Math.random() * array.length;
			while (possible[idx] == false)
				idx = (idx + 1) % array.length;
			guess = array[idx];
			System.out.println("I am guessing " + guess);
			System.out.print("Please enter your response: ");
			response = scnr.nextInt();
		}
		
		if (response == 40)
			System.out.println("Thank you for playing with me!");
		
		if (sizePossible(possible) == 0)
			System.out.println("\nSuch sequence does not exist");
		
		
		
		
		
	}
	
	
}
