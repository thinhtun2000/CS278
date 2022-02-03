package lab6;

import java.util.Scanner;

public class Programn {
	
	public static boolean checkOnto(int[] array, int a, int b, int c) {
		int count = array.length;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == a || array[i] == b || array[i] == c)
				count--;
		}
		return (count == 0);
		
	}
	
	public static boolean checkOneToOne(int[] array, int a, int b, int c) {
		if (a == b || a == c || b == c)
			return false;
		else
			return true;
	}
	
	public static boolean checkBijections(int[] array, int a, int b, int c) {
		int count = 0;
		if (array.length == 3 && a != b && a != c && b != c) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == a || array[i] == b || array[i] == c)
					count++;
			}
		}
		if (count == array.length)
			return true;
		else
			return false;
	}
	
	public static String toString(int count, int[] array, int a, int b, int c) {
		String s = "     ";
		s = s + "f" + "" + count + " is "; 
		if (!checkOneToOne(array, a, b, c))
			s += "not ";
		s += "one-to-one, ";
		if (!checkOnto(array, a, b, c))
			s += "not ";
		s += "onto, and ";
		if (!checkBijections(array, a, b, c))
			s += "not ";
		s += "a bijection.";
		return s;
	}
	
	public static void main(String[] args) {
		
		int n;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("The program will generate all functions from X={a,b,c} to Y={1,...,n}.");
		System.out.print("Please enter the value of n: ");
		n = scnr.nextInt();
		
		int num = (int) Math.pow(n, 3);
		
		int[] Y = new int[n];
		for (int i = 0; i < n; i++) {
			Y[i] = i + 1;
		}
		
		int count = 1;
		int a, b, c;
		int onetoone = 0;
		int onto = 0;
		int bijections = 0;
		
		while (count <= num) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						a = Y[i];
						b = Y[j];
						c = Y[k];
						System.out.printf("f%d(a)=%d     f%d(b)=%d     f%d(c)=%d", count, a, count, b, count, c );
						System.out.println();
						System.out.println(toString(count, Y, a, b, c));
						if (checkOneToOne(Y, a, b, c)) onetoone++;
						if (checkOnto(Y, a, b, c)) onto++;
						if (checkBijections(Y, a, b, c)) bijections++;
						count++;
						System.out.println();
					}
				}
			}
		}
		
		System.out.println("There are " + num + " functions total.");
		System.out.println(onetoone + " of them are one-to-one.");
		System.out.println(onto + " of them are onto.");
		System.out.println(bijections + " of them are bijections.");
		
	}
}
