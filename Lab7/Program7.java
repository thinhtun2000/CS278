package lab7;

import java.util.Scanner;

public class Program7 {
	
	// Method 1
	public static void printDNF(int[][] table) {
		String answer = "";
		for (int i = 0; i < 8; i++) {
			if (table[i][3] == 1) {
				if (table[i][0] == 1)
					answer += "p";
				else
					answer += "p'";
				
				if (table[i][1] == 1)
					answer += "q";
				else
					answer += "q'";
				
				if (table[i][2] == 1)
					answer += "r + ";
				else
					answer += "r' + ";
			}
		}
		answer = answer.substring(0, (answer.length() - 3));
		System.out.println(answer);
	}
	
	// Method 2
	public static void printCNF(int[][] table) {
		String answer = "";
		for (int i = 0; i < 8; i++) {
			if (table[i][3] == 0) {
				if (table[i][0] == 0)
					answer += "(p+";
				else
					answer += "(p'+";
				
				if (table[i][1] == 0)
					answer += "q+";
				else
					answer += "q'+";
				
				if (table[i][2] == 0)
					answer += "r)";
				else
					answer += "r')";
			}
		}
		System.out.println(answer);
	}
	
	// Main()
	public static void main (String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("This program finds Boolean expressions (in CNF and/or DNF)"
				+ "\n that have a given input/output table."
				+ "\nPlease enter values (0 or 1) for each row of the input/output table.");
		
		int[][] table = new int[8][4];
		
		table[0][0] = table[0][1] = table[0][2] = 1; 
		table[1][0] = table[1][1] = 1; table [1][2] = 0;
		table[2][0] = table[2][2] = 1; table [2][1] = 0;
		table[3][0] = 1; table[3][1] = table[3][2] = 0;
		table[4][0] = 0; table[4][1] = table[4][2] = 1;
		table[5][0] = table[5][2] = 0; table[5][1] = 1;
		table[6][0] = table[6][1] = 0; table[6][2] = 1;
		table[7][0] = table[7][1] = table[7][2] = 0;
		
		for (int i = 0; i < 8; i++) {
			System.out.printf("p=%d, q=%d, r=%d. Truth value is (1/0): ", table[i][0], table[i][1], table[i][2]);
			table[i][3] = scnr.nextInt();
		}
		
		for (int i = 0; i < 8; i++) {
			if (table[i][3] == 1) {
				System.out.println("\nDNF expression for the inpput/output table is");
				printDNF(table);
				break;
			}
		}
		
		for (int i = 0; i < 8; i++) {
			if (table[i][3] == 0) {
				System.out.println("\nCNF expression for the inpput/output table is");
				printCNF(table);
				break;
			}
		}

	}
}
