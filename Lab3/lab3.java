import java.util.Scanner;

public class lab3 {

   public static boolean ifNegativeThenEven( int a ) {
      if (a < 0)
         if (a % 2 == 0)
            return true;
         else
            return false;
      else
         return true;
   }
   
   public static boolean negativeAndEven( int a ) {
      if ((a < 0) && (a % 2 == 0))
         return true;
      else
         return false;
   }
   
   public static boolean formOfTwoThreePlusOne( int a ) {
      if((a % 2 == 1) || (a % 3 == 1))
         return true;
      else
         return false;
   }
   
   public static String a( int[] intArray ) {
      for (int i = 0; i < 10; i++) {
         if(ifNegativeThenEven(intArray[i]) != true)
            return "False";
      }
      return "True";
   }
   
   public static String b( int[] intArray ) {
      for (int i = 0; i < 10; i++) {
         if(ifNegativeThenEven(intArray[i]))
            return "True";
      }
      return "False";
   }
   
   public static String c( int[] intArray ) {
      for (int i = 0; i < 10; i++) {
         if(negativeAndEven(intArray[i]))
            return "True";
      }
      return "False";

   }
   
   public static String d( int[] intArray ) {
      for (int i = 0; i < 10; i++) {
         if(formOfTwoThreePlusOne(intArray[i]) != true)
            return "False";
      }
      return "True";
   }
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int[] array = new int[10];
		// Get the input numbers
      System.out.print("Please enter 10 different integers: ");
		for (int i = 0; i < 10; i++) {
			array[i] = scnr.nextInt();
         for (int j = 0; j < i; j++) {
            if (array[i] == array[j])
               i--;
         }
		}
      System.out.println("a) is " + a(array));	
		System.out.println("b) is " + b(array));	
		System.out.println("c) is " + c(array));	
      System.out.println("d) is " + d(array));	
	}

}