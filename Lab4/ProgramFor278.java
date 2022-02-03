package lab4;

public class ProgramFor278 {
	
	// A method that takes a natural number n as a parameter and determines if n is a prime number
	public static boolean primeCheck(int n) {
		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		// Generate an array of the first 100 square values
		int [] square = new int[100];
		int k = 0;
		while (k < 100) {
			square[k] = k*k;
			k++;
		}
		int n = 3;
		while ( n < 10000 ) {
			int cnt = 0;
			if ( !primeCheck(n) ) {
				for (int i = 0; i < 100; i++) {
					if ( n > square[i] && primeCheck(n - 2*square[i]))
						cnt++;
				}
				if (cnt == 0) {
					System.out.println(n + " is the smallest counterexample.");
					break;
				}
			}
			n += 2;
		}
	}
}
