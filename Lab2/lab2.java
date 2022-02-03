public class lab2 {
	
	public static char not( char x ) {
		if (x == 'T')
			return 'F';
		else
			return 'T';
	}
	
	public static char or(char x, char y) {
		if (x == 'T' || y == 'T')
			return 'T';
		else
			return 'F';
	}
	
	public static char and(char x, char y) {
		if (x == 'F' || y == 'F')
			return 'F';
		else
			return 'T';
	}
	
	public static char implies(char x, char y) {
		if (x == 'T' && y == 'T')
			return 'T';
		else if (x == 'F')
			return 'T';
		else
			return 'F';
	}

	public static void main(String[] args) {
		// Declare variables for proposition
		char p, q, r;
		
		// Computing and printing tables for proposition 1
		int numT1 = 0;
		int numF1 = 0;
		System.out.println("p q r proposition 1");
		System.out.println("-----------------");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					
					// Generate truth values
					if (i == 0) p = 'F';
					else p = 'T';
					if (j == 0) q = 'F';
					else q = 'T';
					if (k == 0) r = 'F';
					else r = 'T';
					
					// Compute the truth value and print
					char result = and( implies( not(p), q ), implies( r, p) );
					System.out.print(p + " ");
					System.out.print(q + " ");
					System.out.print(r + " ");
					System.out.println(result);
					if (result == 'T') numT1++;
					if (result == 'F') numF1++;
				}
			}
		}
		System.out.println();
		System.out.println( numT1 + " combinations result in Proposition 1 being T.");
		System.out.println( numF1 + " combinations result in Proposition 1 being F.");
		if (numT1 == 8)
			System.out.println("Proposition 1 is a tautology.");
		else if (numF1 == 8)
			System.out.println("Proposition 1 is a contradiction.");
		else 
			System.out.println("Proposition 1 is neither a tautology nor a contradiction.");
		System.out.println();
		
		
		// Computing and printing tables for proposition 2
		int numT2 = 0;
		int numF2 = 0;
		System.out.println("p q r proposition 2");
		System.out.println("-----------------");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					
					// Generate truth values
					if (i == 0) p = 'F';
					else p = 'T';
					if (j == 0) q = 'F';
					else q = 'T';
					if (k == 0) r = 'F';
					else r = 'T';
							
					// Compute the truth value and print
					char result = and( or( p, not(q) ), or( r, not(implies( p, q ))) );
					System.out.print(p + " ");
					System.out.print(q + " ");
					System.out.print(r + " ");
					System.out.println(result);
					if (result == 'T') numT2++;
					if (result == 'F') numF2++;
				}
			}
		}
		System.out.println();
		System.out.println( numT2 + " combinations result in Proposition 2 being T.");
		System.out.println( numF2 + " combinations result in Proposition 2 being F.");
		if (numT2 == 8)
			System.out.println("Proposition 2 is a tautology.");
		else if (numF2 == 8)
			System.out.println("Proposition 2 is a contradiction.");
		else 
			System.out.println("Proposition 2 is neither a tautology nor a contradiction.");
		System.out.println();
		
		
		// Computing and printing tables for proposition 3
		int numT3 = 0;
		int numF3 = 0;
		System.out.println("p q r proposition 3");
		System.out.println("-----------------");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					
					// Generate truth values
					if (i == 0) p = 'F';
					else p = 'T';
					if (j == 0) q = 'F';
					else q = 'T';
					if (k == 0) r = 'F';
					else r = 'T';
					
					// Compute the truth value and print
					char result = implies( p, implies( not(and(p, not(q))), and(p, q)) );
					System.out.print(p + " ");
					System.out.print(q + " ");
					System.out.print(r + " ");
					System.out.println(result);
					if (result == 'T') numT3++;
					if (result == 'F') numF3++;
				}
			}
		}
		System.out.println();
		System.out.println( numT3 + " combinations result in Proposition 3 being T.");
		System.out.println( numF3 + " combinations result in Proposition 3 being F.");
		if (numT3 == 8)
			System.out.println("Proposition 3 is a tautology.");
		else if (numF3 == 8)
			System.out.println("Proposition 3 is a contradiction.");
		else 
			System.out.println("Proposition 3 is neither a tautology nor a contradiction.");
		System.out.println();
			
		
		// Computing and printing tables for proposition 4
		int numT4 = 0;
		int numF4 = 0;
		System.out.println("p q r proposition 4");
		System.out.println("-----------------");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					
					// Generate truth values
					if (i == 0) p = 'F';
					else p = 'T';
					if (j == 0) q = 'F';
					else q = 'T';
					if (k == 0) r = 'F';
					else r = 'T';
					
					// Compute the truth value and print
					char result = and( and(p, implies(p, q)), not(q));
					System.out.print(p + " ");
					System.out.print(q + " ");
					System.out.print(r + " ");
					System.out.println(result);
					if (result == 'T') numT4++;
					if (result == 'F') numF4++;
				}
			}
		}
		System.out.println();
		System.out.println( numT4 + " combinations result in Proposition 4 being T.");
		System.out.println( numF4 + " combinations result in Proposition 4 being F.");
		if (numT4 == 8)
			System.out.println("Proposition 4 is a tautology.");
		else if (numF4 == 8)
			System.out.println("Proposition 4 is a contradiction.");
		else 
			System.out.println("Proposition 4 is neither a tautology nor a contradiction.");
		System.out.println();
		}
}
